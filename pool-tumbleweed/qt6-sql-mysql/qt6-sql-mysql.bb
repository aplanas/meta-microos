SUMMARY = "Qt 6 MySQL support"
DESCRIPTION = "A plugin to access MySQL servers in Qt applications."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-sql-mysql-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "cc4b357a098dc6a6bbc19ef83f643714ca8a240b82add77dcff6a23125c7de0ef3a0a8f98ee73c2334bb1ea6c7ef2a142d5da8f95960a9ed222af2a45f662d14"

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
