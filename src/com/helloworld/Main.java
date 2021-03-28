import java.util.Scanner;

class Greeting {

    Scanner in = new Scanner(System.in);

    String[][] paketwisata = {{"", "Malang", "Jogja", "Bandung"},
            {"", "3 HARI, 2 MALAM", "4 HARI, 3 MALAM", "5 HARI, 4 MALAM"},
            {"", "2400000", "3200000", "4000000"}};
    String[][] custom = {{"", "Bali", "Lombok", "Solo", "Jogja", "Bandung"},
            {"", "520000", "670000", "435000", "450000", "470000"}};

    //Deklarasi Variabel
    String tujuan, waktu;
    int plh, wst, ctm, pkt, hari, harga, byr, tw, tc, org, tagihan3;
    float dsc;
    boolean prsn = true, day = true;

    void menu() {
        for (int i = 1; i <= 56; i++) {
            System.out.print("=");
        }
        System.out.println("\n                     SELAMAT DATANG                   ");
        System.out.println("                       DI PROGRAM                       ");
        System.out.println("                    TRAVEL SEDERHANA                    ");
        System.out.println("========================================================");
        System.out.println("> 1. PAKET WISATA PREMIUM                      ");
        System.out.println("> 2. PAKET WISATA HARIAN                       ");
        System.out.println("--------------------------------------------------------");
    }

    void pilih() {
        switch (plh) {
            case 1:
                System.out.println("\n=====================================================");
                System.out.println("               PAKET WISATA PREMIUM                  ");
                System.out.println("-----------------------------------------------------");
                for (int i = 1; i < paketwisata[0].length; i++) {
                    System.out.println(" " + i + ". " + paketwisata[0][i] + ", " + paketwisata[1][i] + ", Rp." + paketwisata[2][i] + ",-");
                }
                System.out.println("=====================================================");
                System.out.print("Pilih Paket Wisata : ");
                wst = in.nextInt();
                paketwisata();
                break;
            case 2:
                System.out.println("\n=============================");
                System.out.println("          Destinasi");
                System.out.println("-----------------------------");
                for (int i = 1; i < custom[0].length; i++) {
                    System.out.println(+ i + ". " + custom[0][i]+ ", Rp." + custom[1][i] + ",-");
                }
                System.out.println("-----------------------------");
                System.out.print("Pilih Destinasi Wisata : ");
                ctm = in.nextInt();
                custom();
                break;
            default:
                System.out.println("Menu yang Anda Input Invalid");
                System.out.print("Masukan Menu yang Tersedia : ");
                plh = in.nextInt();
                pilih();
                break;
        }
    }

    void paketwisata() {
        switch (wst) {
            case 1:
                System.out.print("Jumlah Orang       : ");
                pkt = in.nextInt();
                tujuan = paketwisata[0][wst];
                waktu = paketwisata[1][wst];
                harga = Integer.parseInt(paketwisata[2][wst]);
                tw = harga * pkt;
                break;
            case 2:
                System.out.print("Jumlah Orang       : ");
                pkt = in.nextInt();
                tujuan = paketwisata[0][wst];
                waktu = paketwisata[1][wst];
                harga = Integer.parseInt(paketwisata[2][wst]);
                tw = harga * pkt;
                break;
            case 3:
                System.out.print("Jumlah Orang       : ");
                pkt = in.nextInt();
                tujuan = paketwisata[0][wst];
                waktu = paketwisata[1][wst];
                harga = Integer.parseInt(paketwisata[2][wst]);
                tw = harga * pkt;
                break;
            default:
                break;

        }
        System.out.println("----------------------------------");
        System.out.println("     RINCIAN PAKET WISATA ANDA    ");
        System.out.println("----------------------------------");
        System.out.println("Destinasti       : " + tujuan);
        System.out.println("Waktu            : " + waktu);
        System.out.println("Jumlah Paket     : " + pkt + " Paket");
        System.out.println("Harga Paket      : Rp." + harga + ",-/org");
        System.out.println("----------------------------------");
        System.out.println("Total harga      : Rp." + tw + ",-");

    }
    void custom(){
        switch (ctm) {
            case 1:
                tujuan = custom[0][ctm];
                harga = Integer.parseInt(custom[1][ctm]);
                break;
            case 2:
                tujuan = custom[0][ctm];
                harga = Integer.parseInt(custom[1][ctm]);
                break;
            case 3:
                tujuan = custom[0][ctm];
                harga = Integer.parseInt(custom[1][ctm]);
                break;
            case 4:
                tujuan = custom[0][ctm];
                harga = Integer.parseInt(custom[1][ctm]);
                break;
            case 5:
                tujuan = custom[0][ctm];
                harga = Integer.parseInt(custom[1][ctm]);
                break;
            default:
                System.out.println("Destinasi Wisata Tidak Ada");
                break;
        }
        while (prsn){
            System.out.print("Jumlah Orang  : ");
            org = in.nextInt();
            if(org < 2){
                System.out.println("Minimal 2 Org.");
                prsn = true;
            }else{
                prsn = false;
            }
        }
        while (day){
            System.out.print("Jumlah Hari   : ");
            hari = in.nextInt();
            if(org < 2){
                System.out.println("Minimal 2 Hari.");
                day = true;
            }else{
                day = false;
            }
        }
        tc = harga*hari*org;
        System.out.println("----------------------------------");
        System.out.println("     RINCIAN PAKET WISATA ANDA    ");
        System.out.println("----------------------------------");
        System.out.println("Destinasi        : "+tujuan);
        System.out.println("Waktu            : "+hari+" Hari");
        System.out.println("Jumlah Orang     : "+org+" Orang");
        System.out.println("Harga            : Rp."+harga+",-/Hari");
        System.out.println("----------------------------------");
        System.out.println("Total Pembayaran : Rp."+tc+",-");
    }

    void pembayaran() {
        System.out.println("----------------------------");
        System.out.println("\n\n      Metode Pembayaran ");
        System.out.println("----------------------------");
        System.out.println("1. Tunai");
        System.out.println("2. Bank");
        System.out.println("----------------------------");
        System.out.println("Pilih Metode Pembayaran :   "); byr = in.nextInt();
        switch (byr) {
            case 1:
                System.out.println("Segera Ke Kantor Kami Untuk Melakukan Pembayaran");
                break;
            case 2:
                System.out.println("Lakukan Transfer ke Bank BNI dengan No Rek. 817247812638");
                System.out.println("Kirim Bukti Pembayaran ke 087654223417");
        }
    }
}

class travelSederhana {
    public static void main(String[] args) {
        Greeting intro = new Greeting();

        intro.menu();
        System.out.print("Masukkan Paket Wisata yang Diinginkan : ");
        intro.plh = intro.in.nextInt();
        intro.pilih();
        intro.pembayaran();
        System.out.println("\n             TERIMA KASIH");
        System.out.println("        Nikmati Perjalanan Anda");
        System.out.println("Kepuasan Pelanggan, Kebahagiaan Bagi Kami");
        System.out.println("==========================================");
    }
}