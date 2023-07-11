SUMMARY = "Qt 5 PostgreSQL plugin"
DESCRIPTION = "The Qt SQL module uses driver plugins to communicate with the \
different database APIs. \
 \
The QPSQL driver supports version 7.3 and higher of the PostgreSQL \
server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql5-postgresql-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "2af279a436c74b28dff11a48a196d00fb328056d1fcc80fdcf79f4ac8c91e01a1a7a88ea48cf2fb70fc9f7df7f8f9c39b2a3c48fbb6985e7a9a1528ff66d68d9"

RPROVIDES:${PN} += "libQt5Sql5-postgresql \
libqsqlpsql.so \
libqt5-sql-backend \
libqt5-sql-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libQt5Sql5 \
libc.so.6 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
