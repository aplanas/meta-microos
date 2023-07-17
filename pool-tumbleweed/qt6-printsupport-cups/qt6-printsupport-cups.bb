SUMMARY = "Qt 6 CUPS plugin"
DESCRIPTION = "The Qt printsupport CUPS plugin."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-printsupport-cups-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "65befa7d2c07fd3420a87d47fdeec9f8a9faeeca0458eb38018fef761344ca72a5d4c86330eeb5346fd277a1cc031abcc9ffa5cae2f4770abf50d3ef1d4916be"

RPROVIDES:${PN} += "libcupsprintersupport.so \
qt6-printsupport-cups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6PrintSupport6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcups.so.2 \
libstdc++.so.6"

inherit rpm
