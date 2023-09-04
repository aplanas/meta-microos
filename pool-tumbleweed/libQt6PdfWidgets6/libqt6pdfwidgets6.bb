SUMMARY = "Qt6 PdfWidgets library"
DESCRIPTION = "The Qt6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6PdfWidgets6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "d643d116632249364bb3d2d6c4423ef0a4c8951168c7b453fb0addb2dc14610c82499b7c3d9c1c660717909eec5324f44c42b8f804bf43ea6a1063063f8f0a08"

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
