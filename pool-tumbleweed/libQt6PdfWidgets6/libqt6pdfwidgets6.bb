SUMMARY = "Qt6 PdfWidgets library"
DESCRIPTION = "The Qt6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6PdfWidgets6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "05a063bf4969b1bbdcbad5e6b54037f9e3814f02690c1a948762d22b5ce250f611be222ba377529f86f170715536ddaf4fa8d6d70934e6709fc3d072134d1c98"

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
