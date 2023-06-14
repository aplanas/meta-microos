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

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Sql5-sqlite-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "cfed1783f250e74102f262a67e727e40694dfb099421d60c7d3c2a3b40e1d5a74b8ee08bef73f4d59337035d8669630b1fb0f893759cd068ef6ba3cdf523a529"

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
