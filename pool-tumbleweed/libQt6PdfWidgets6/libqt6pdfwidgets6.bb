SUMMARY = "Qt6 PdfWidgets library"
DESCRIPTION = "The Qt6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6PdfWidgets6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7b2f9260f18b5ea8f6a1e1e78d76cfa59eb2b10fc0eba1433573fbf8c831181e2c25583eeb0fccbb7852358e63494db156e18c0321cdd1cc80e485dbfc0c8a0a"

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
