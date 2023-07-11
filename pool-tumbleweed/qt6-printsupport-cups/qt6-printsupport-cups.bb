SUMMARY = "Qt 6 CUPS plugin"
DESCRIPTION = "The Qt printsupport CUPS plugin."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-printsupport-cups-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "e71b76da88e9aa19f8000063a0f3575e46443583bf1456528264a68e42c7cc3451d67815830fba07ded2688b34887887102e1f00c57c65d39a4867b0a48636bc"

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
