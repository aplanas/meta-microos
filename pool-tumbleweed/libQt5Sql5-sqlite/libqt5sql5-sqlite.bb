SUMMARY = "Qt 5 sqlite plugin"
DESCRIPTION = "The Qt SQL module uses driver plugins to communicate with the \
different database APIs. \
 \
The Qt SQLite plugin makes it possible to access SQLite databases. \
SQLite is an in-process database, which means that it is not \
necessary to have a database server. SQLite operates on a single \
file, which must be set as the database name when opening a \
connection."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql5-sqlite-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "70a5940c54d9e3d0d086e95dc46440fdd6b268ae9a0879d70c7448a8595e73c11eb80d53f222721f46fe420e1ce88624ca99bce02991a38e86774b6506556385"

RPROVIDES:${PN} += "libQt5Sql5-sqlite \
libqsqlite.so \
libqt5-sql-backend \
libqt5-sql-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libQt5Sql5 \
libc.so.6 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
