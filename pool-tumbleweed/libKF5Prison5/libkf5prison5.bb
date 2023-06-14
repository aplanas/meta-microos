SUMMARY = "Barcode abstraction layer library"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "5.106.0"

RPM_NAME = "libKF5Prison5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "24695232f0a3d68ee0b575afc5cbc497117064160f4bced3e79d9c2f60c00f90342b4d06d727e8c86d001f76a72857da7668fcb07bd28a2d1baf0fb011e58e1f"

RPROVIDES:${PN} += "libKF5Prison.so.5 \
libKF5Prison5 \
libKF5PrisonScanner.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libZXing.so.3 \
libc.so.6 \
libdmtx.so.0 \
libgcc-s.so.1 \
libqrencode.so.4 \
libstdc++.so.6"

inherit rpm
