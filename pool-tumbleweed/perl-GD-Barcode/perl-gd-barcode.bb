SUMMARY = "Create barcode image with GD"
DESCRIPTION = "GD::Barcode is a subclass of GD and allows you to create barcode image with \
GD. This module based on 'Generate Barcode Ver 1.02 By Shisei Hanai \
97/08/22'. \
 \
From 1.14, you can use this module even if no GD (except plot method)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.15"

RPM_NAME = "perl-GD-Barcode-1.15-25.28.noarch.rpm"
RPM_HASH = "05a62c8dcee6c169bf4e31f58d783e6f3de90b32aa2efda65fbcf265577f2ff7f1a1c0f9b03601221ade1e0f2ad2b1dbbec4e24d95f844ca785755d850624eff"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
