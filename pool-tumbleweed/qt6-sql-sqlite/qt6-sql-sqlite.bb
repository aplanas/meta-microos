SUMMARY = "Qt 6 SQLite plugin"
DESCRIPTION = "A plugin to access SQLite databases in Qt applications. \
 \
SQLite is an in-process database, which means that it is not \
necessary to have a database server. SQLite operates on a single \
file, which must be set as the database name when opening a \
connection."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-sql-sqlite-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "1faa2d2c7b8643b9d07b8c7857cf2c4b5ccb00f68cc1eef4c6e756068a87b2b5dec7dbbfbaeba495e1c6179e31b6d1f18f86cf30ac78d324bd9c4186480cfc7f"

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
