SUMMARY = "Qt 6 MySQL support"
DESCRIPTION = "A plugin to access MySQL servers in Qt applications."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-mysql-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "43f53cf5dd443585a18928337333ef336fd80e76ca6b38a6900062d51ee2f33c643bb2c16d376ba67e1ba3b52aeaebbb33eb0bc9749a6156f0d2365a89d6f81b"

RPROVIDES:${PN} += "libqsqlmysql.so \
qt6-sql-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libQt6Sql6 \
libc.so.6 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
