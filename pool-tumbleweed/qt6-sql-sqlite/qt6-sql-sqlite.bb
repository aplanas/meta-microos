SUMMARY = "Qt 6 SQLite plugin"
DESCRIPTION = "A plugin to access SQLite databases in Qt applications. \
 \
SQLite is an in-process database, which means that it is not \
necessary to have a database server. SQLite operates on a single \
file, which must be set as the database name when opening a \
connection."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-sqlite-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "e98fa3e890ba2e5cd067a2ac29d84595c4ee03eee80044c9996f1584becab5f568631c5c94a79537a1d3c7bfc9f36d277f151dbe784b9a174489de0d55387290"

RPROVIDES:${PN} += "libqsqlite.so \
qt6-sql-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libQt6Sql6 \
libc.so.6 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
