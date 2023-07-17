SUMMARY = "Qt 5 PostgreSQL plugin"
DESCRIPTION = "The Qt SQL module uses driver plugins to communicate with the \
different database APIs. \
 \
The QPSQL driver supports version 7.3 and higher of the PostgreSQL \
server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql5-postgresql-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "d512505c2a419821f6798485a5c145a0cb3bd036848b3636ae1abf26c419f0144bdba066a1ccd34b8c284d7081ae70068685d3af576464ed11f7f426b5219232"

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
