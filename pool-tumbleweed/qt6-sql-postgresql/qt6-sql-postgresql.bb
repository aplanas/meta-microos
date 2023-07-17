SUMMARY = "Qt 6 PostgreSQL plugin"
DESCRIPTION = "A plugin to access PostgreSQL servers in Qt applications. \
 \
The QPSQL driver supports version 9 and higher of the PostgreSQL \
server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-postgresql-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "15318ba3d109b78c0cb7a4c047689e7769b6004bf8c9496de67c4a2af1802661b0a434345b9c1af59112480a9e74d1538bdb7adf05779d1c1f678cb648a459e4"

RPROVIDES:${PN} += "libqsqlpsql.so \
qt6-sql-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libQt6Sql6 \
libc.so.6 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
