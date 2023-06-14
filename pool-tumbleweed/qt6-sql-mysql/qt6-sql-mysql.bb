SUMMARY = "Qt 6 MySQL support"
DESCRIPTION = "A plugin to access MySQL servers in Qt applications."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-mysql-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c6df01964cbfe1048e3d6b4176a980cf3f4407edf269b8c9bb831c90965d0096ce48b68b0ee0250e915b7a4ebb259d620c52671523a48e69a5122098e3d16592"

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
