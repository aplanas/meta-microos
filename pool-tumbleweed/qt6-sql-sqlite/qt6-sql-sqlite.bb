SUMMARY = "Qt 6 SQLite plugin"
DESCRIPTION = "A plugin to access SQLite databases in Qt applications. \
 \
SQLite is an in-process database, which means that it is not \
necessary to have a database server. SQLite operates on a single \
file, which must be set as the database name when opening a \
connection."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-sql-sqlite-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3453a3a8c7358bc2836f62ec5dda1cbfc1c0d084dbd2309bc9762f7450024bf96fa2d9a869c0e43ecea77606eaa568fa1fa72ce1c12edc37c876a6fc6a2823d9"

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
