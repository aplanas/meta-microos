SUMMARY = "Qt 5 MySQL support"
DESCRIPTION = "A plugin to support MySQL server in Qt applications."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Sql5-mysql-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "1152a3f57ae109cb1b79ec3b7b5d0cafa79e18e528a88d7726784008968150122bff6784cb36737f4dc058f154e7fe11a684c8e90cc6329034af75853cefa088"

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
