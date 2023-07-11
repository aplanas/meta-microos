SUMMARY = "Qt Help files generator"
DESCRIPTION = "Qt 6 tool for generating .qch help catalogs."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-helpgenerators-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "a6330556550459b2617fb32d868e83d41147954330eec60ae5b4f42f56bb93175dc531a9d64b2678d628b0307c8a83fecca74ba81141d5479392063a7bfac704"

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
