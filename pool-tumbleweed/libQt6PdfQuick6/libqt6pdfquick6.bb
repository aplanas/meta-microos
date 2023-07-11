SUMMARY = "Qt6 PdfQuick library"
DESCRIPTION = "The Qt6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6PdfQuick6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "56b9e17200633c03bae7e8765b3d70bc8ad5623ffac1f95046faa10cd8e04a83faa3f49b24acb03e5b44e64cd8d0f9679a019ce4a49b648c2be34e4308f1dc16"

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
