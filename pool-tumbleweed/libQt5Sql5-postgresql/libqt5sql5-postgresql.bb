SUMMARY = "Qt 5 PostgreSQL plugin"
DESCRIPTION = "The Qt SQL module uses driver plugins to communicate with the \
different database APIs. \
 \
The QPSQL driver supports version 7.3 and higher of the PostgreSQL \
server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Sql5-postgresql-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "7fc299ab41218b8f456ca99da00c778d372284cb8c178935b6abf0ab775d3d4741e754d3d6bf92024ba73d7f26e80a9365df449e501f097468f845186a13f3ba"

RPROVIDES:${PN} += "libQt5Sql5-postgresql \
libQt5Sql5-postgresql(aarch-64) \
libqsqlpsql.so()(64bit) \
libqt5-sql-postgresql \
libqt5_sql_backend"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql5 \
libc.so.6()(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
