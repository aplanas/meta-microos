SUMMARY = "Qt 5 MySQL support"
DESCRIPTION = "A plugin to support MySQL server in Qt applications."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql5-mysql-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "807bc05c52746855da1e7169a8331129b9ef040aab036facded425a12f3f495b035b3bde485faf6b783d056f9414908cbbdb3ca8035a4ce3d54ac1af54eecf25"

RPROVIDES:${PN} += "libQt5Sql5-mysql \
libqsqlmysql.so \
libqt5-sql-backend \
libqt5-sql-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libQt5Sql5 \
libc.so.6 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
