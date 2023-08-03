SUMMARY = "Qt 6 MySQL support"
DESCRIPTION = "A plugin to access MySQL servers in Qt applications."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-sql-mysql-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0eb65bd49604c0283068c8931bc7f71ef48621c8cf7987b3fb8c84b627529b3acf6abc6d1e2192070cda0de6dd28b72947fe7d7b0728a8aef4d180e51d4b2581"

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
