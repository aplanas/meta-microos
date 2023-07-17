SUMMARY = "Qt6 PdfQuick library"
DESCRIPTION = "The Qt6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6PdfQuick6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0397594a5f1977450d1016b1a97b9866cf6e8d5cc6eebabb01d59186bca6fd6e2e09d1ee5478caf45994090a5bc4b18f3346685810ae115c9bc835c825b686a2"

RPROVIDES:${PN} += "libQt6PdfQuick.so.6 \
libQt6PdfQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Pdf.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
