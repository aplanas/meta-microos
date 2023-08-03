SUMMARY = "Qt 6 CUPS plugin"
DESCRIPTION = "The Qt printsupport CUPS plugin."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-printsupport-cups-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "444051949ad3fb02bfbd09a8f2888500e501c1525ede52de84350b135fdbf3217504c3dcabd5818d0469b4d8c5bf55ea1517221f0b875c63479ce11330a5f4aa"

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
