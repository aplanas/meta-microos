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

RPM_NAME = "libQt5Sql5-sqlite-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "4d12356670dc746113174232ef28fce5d595a6ac4831b4b611ef33b8a39edc194fae8a3ab8ec042f48c5b096db7464cacc7f1b1f8f524de4fcfbf06bf0ab5582"

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
