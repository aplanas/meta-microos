SUMMARY = "Qt6 PdfWidgets library"
DESCRIPTION = "The Qt6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6PdfWidgets6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "eeb59ae1d48f4d674e4e595781d708eecb0215b0a0eb944351d70031f4da0d61c5e0567ee7614979df57831707317ed32e64f6f373bdd8adc181c8ed1ca18c7d"

RPROVIDES:${PN} += "libQt6PdfWidgets.so.6 \
libQt6PdfWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Pdf.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
