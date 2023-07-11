SUMMARY = "Qt 5 MySQL support"
DESCRIPTION = "A plugin to support MySQL server in Qt applications."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql5-mysql-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "56fccf3d3a17289dacd42731801fb971dead9b5bf69569b2ee8f31debbc0e81a3a9ace62b1379ede0a3887bfdccb282d23767a10d9f79be34e8e0e947bd76509"

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
