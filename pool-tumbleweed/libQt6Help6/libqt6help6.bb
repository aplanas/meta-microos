SUMMARY = "Qt 6 Help library"
DESCRIPTION = "This package contains the Qt 6 Help library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6Help6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a8d216d029fb24ae784af0b2e4ebe23cdc3ec397ccb20e86e0b18b49f2a9110e22266fceee23cad971dd98fbd0336c9a9161fe514e529a1b66d8443114aa6e84"

RPROVIDES:${PN} += "libQt6Help.so.6 \
libQt6Help6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
