package proje1;
import java.util.Scanner;

public class proje1_1 {
    public static void main(String[] args) {

        double pi = 3.14, r,alan,cevre;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yarıçapı Giriniz : ");
        r = inp.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Alan : " +alan);
        System.out.println("Cevre : " +cevre);


    }
}