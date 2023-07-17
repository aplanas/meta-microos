SUMMARY = "Qt 6 SQLite plugin"
DESCRIPTION = "A plugin to access SQLite databases in Qt applications. \
 \
SQLite is an in-process database, which means that it is not \
necessary to have a database server. SQLite operates on a single \
file, which must be set as the database name when opening a \
connection."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-sqlite-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "ab241ef5826585783778c9f0b9a8da46f0082d62eb701e5c866332fdea725c89143f6aa6d9dbb78f7354780e800fabdc055f662a6e0a23b06f0e1c75ffe5b9ca"

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
