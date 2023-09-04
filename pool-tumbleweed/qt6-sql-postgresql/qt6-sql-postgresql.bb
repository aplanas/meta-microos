SUMMARY = "Qt 6 PostgreSQL plugin"
DESCRIPTION = "A plugin to access PostgreSQL servers in Qt applications. \
 \
The QPSQL driver supports version 9 and higher of the PostgreSQL \
server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-sql-postgresql-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "3bcdec67418c26eeefe198effd7ef5dc3ebd6866c6a7761a9a5373e04ac2c1ec7a69a3868498c3b94a44b3aeb4f16238a5db33eeaf14a440c8eb00da7f50418e"

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
