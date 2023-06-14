SUMMARY = "Qt 6 CUPS plugin"
DESCRIPTION = "The Qt printsupport CUPS plugin."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-printsupport-cups-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "13256d140129e16ea1b029501ec6c52f107018718e57c997b67ee9d04816787bdcfe7cba7f5751b4eeac1f0f56aadb21dfbf1a1dd192db4f462ba8116ec44f78"

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
