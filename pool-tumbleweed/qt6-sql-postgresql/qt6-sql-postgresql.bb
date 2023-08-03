SUMMARY = "Qt 6 PostgreSQL plugin"
DESCRIPTION = "A plugin to access PostgreSQL servers in Qt applications. \
 \
The QPSQL driver supports version 9 and higher of the PostgreSQL \
server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-sql-postgresql-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "91b262e64332bd8f3cfefdaa0905ab681c7fd561e477488b0a0d1c99fb6484fe7c5ff1f28f1ff7faec39d63eedb6be75635f4a450c64838bce830ca1ba5ed556"

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
