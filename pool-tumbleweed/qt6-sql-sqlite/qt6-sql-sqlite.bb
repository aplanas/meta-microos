SUMMARY = "Qt 6 SQLite plugin"
DESCRIPTION = "A plugin to access SQLite databases in Qt applications. \
 \
SQLite is an in-process database, which means that it is not \
necessary to have a database server. SQLite operates on a single \
file, which must be set as the database name when opening a \
connection."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-sqlite-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0c09b5d853b58673354012dbbbccf0ac6f7097f45b20f0169b9e90589bf1d62a7f4ff9ce1c93d9d1e425badaf95940c076941793971a7479cdffb100db6fd227"

RPROVIDES:${PN} += "libqsqlite.so()(64bit) \
libqsqlite.so(Qt_6)(64bit) \
libqsqlite.so(Qt_6.0)(64bit) \
libqsqlite.so(Qt_6.1)(64bit) \
libqsqlite.so(Qt_6.2)(64bit) \
libqsqlite.so(Qt_6.3)(64bit) \
libqsqlite.so(Qt_6.4)(64bit) \
libqsqlite.so(Qt_6.5)(64bit) \
libqsqlite.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-sql-sqlite \
qt6-sql-sqlite(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Sql.so.6()(64bit) \
libQt6Sql.so.6(Qt_6)(64bit) \
libQt6Sql.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Sql6 \
libc.so.6(GLIBC_2.17)(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
