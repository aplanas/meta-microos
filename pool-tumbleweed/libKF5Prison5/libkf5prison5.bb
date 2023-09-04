SUMMARY = "Barcode abstraction layer library"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "5.109.0"

RPM_NAME = "libKF5Prison5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "82e35fcf012dd54440d2b4ed0dbfecc73b38a8c1d8ac9c674bf6d30e380954dfa47fa53429d97d45a4b5225ba1e8b3ed91eade560d9342538203951feb33020e"

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
