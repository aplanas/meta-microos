SUMMARY = "Qt6 PdfQuick library"
DESCRIPTION = "The Qt6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6PdfQuick6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d5da6a332aeddb70b21f48b854f491f30865f61faac90d0588b97576a042767038d2aaee1551d5e3da44c70255992d55bad412375022f2c6bf992dde06255896"

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
