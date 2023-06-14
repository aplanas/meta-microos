SUMMARY = "Qt Help files generator"
DESCRIPTION = "Qt 6 tool for generating .qch help catalogs."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-helpgenerators-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3f386348a02b4e4ec8b4509f9d541f779db5e28ae78c6a07f6a3178605ece3963c7d272cfd4cadcbf4d692b124fbad2654e0dbe45726e0b768163eda2afe72ea"

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
