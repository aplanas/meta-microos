SUMMARY = "Create barcode image with GD"
DESCRIPTION = "GD::Barcode is a subclass of GD and allows you to create barcode image with \
GD. This module based on 'Generate Barcode Ver 1.02 By Shisei Hanai \
97/08/22'. \
 \
From 1.14, you can use this module even if no GD (except plot method)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.15"

RPM_NAME = "perl-GD-Barcode-1.15-25.27.noarch.rpm"
RPM_HASH = "34510ec3dc005c9ba51e3437ec874c64d31b524cb27227899e49f15fa668e0fb004913a4d6aa332a0aa53f38991857b59c7723fd7b4f5b901343fead3190b121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GD--Barcode \
perl-GD--Barcode--COOP2of5 \
perl-GD--Barcode--Code39 \
perl-GD--Barcode--EAN13 \
perl-GD--Barcode--EAN8 \
perl-GD--Barcode--IATA2of5 \
perl-GD--Barcode--ITF \
perl-GD--Barcode--Industrial2of5 \
perl-GD--Barcode--Matrix2of5 \
perl-GD--Barcode--NW7 \
perl-GD--Barcode--QRcode \
perl-GD--Barcode--UPCA \
perl-GD--Barcode--UPCE \
perl-GD-Barcode"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
