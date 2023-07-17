SUMMARY = "Barcode abstraction layer library"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "5.108.0"

RPM_NAME = "libKF5Prison5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "7c0ab7a0a08626f66f85bae53cc553df6d45ea155be13e574ca7fd6efee7e31afbf0cd5fd88b73b05592d241b349d596a1d9291fad8208e1c86dbff918f9935f"

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
