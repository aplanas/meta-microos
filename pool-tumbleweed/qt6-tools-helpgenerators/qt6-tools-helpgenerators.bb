SUMMARY = "Qt Help files generator"
DESCRIPTION = "Qt 6 tool for generating .qch help catalogs."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-tools-helpgenerators-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "853d623a0b23b7000fc48af30cf4cdab30a79899a8baad0f8b42799ce914a6c449ed161885c72e417615f86cada5a41e619af7033a4fafb4bb2ae8a1cb488fcc"

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
