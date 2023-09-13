SUMMARY = "A printer application framework"
DESCRIPTION = "PAPPL is a framework/library for developing CUPS Printer \
Applications, which are the recommended replacement for printer \
drivers. \
 \
PAPPL supports JPEG, PNG, PWG Raster, Apple Raster, and 'raw' \
printing to printers connected via USB and network \
(AppSocket/JetDirect) connections."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "libpappl1-1.3.4-1.1.aarch64.rpm"
RPM_HASH = "e338b57d5e8fd99f95c635804094ebacca58a690f99c28fd43e256f3096861f90999a7e49b11cb03211a8c36bff153cc12bd67061ee0ec249ff61f10f99acc1c"

RPROVIDES:${PN} += "libpappl.so.1 \
libpappl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcrypto.so.3 \
libcups.so.2 \
libjpeg.so.8 \
libpam.so.0 \
libpng16.so.16 \
libusb-1.0.so.0"

inherit rpm
