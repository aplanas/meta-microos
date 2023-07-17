SUMMARY = "Qt Help files generator"
DESCRIPTION = "Qt 6 tool for generating .qch help catalogs."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-helpgenerators-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "5080e6734d5047e1b823d630561120eb02bd7004622022f6d60bbe865d4a7ddc54cc11e6ab19048b6730fdd8c66f5909489d5500b6ba120cc2bd2c5dffaa4a02"

RPROVIDES:${PN} += "qt6-tools-helpgenerators"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-docs-common \
qt6-sql-sqlite"

inherit rpm
