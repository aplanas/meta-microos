SUMMARY = "Qt 6 PostgreSQL plugin"
DESCRIPTION = "A plugin to access PostgreSQL servers in Qt applications. \
 \
The QPSQL driver supports version 9 and higher of the PostgreSQL \
server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-postgresql-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e93048e41e948113a86af5840f9611fb87bc7f3e35ac58d5203f1bcea1b279be4e697aebc6167e9e53cabc400505b22e69ab6a74b7c738b382ebf5999938fdd1"

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
