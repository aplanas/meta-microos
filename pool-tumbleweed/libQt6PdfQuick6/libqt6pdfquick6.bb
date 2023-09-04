SUMMARY = "Qt6 PdfQuick library"
DESCRIPTION = "The Qt6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6PdfQuick6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "a60af3fa2b7ecc414c26acdb50a4390519a5f7ca31514ee001480fee08c9ec017e7948aba4a6d6939afb3519a36db5872b455d281d4c5eb0aa5cdef0e118dcee"

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
