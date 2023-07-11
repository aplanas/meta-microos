SUMMARY = "Test a MySQL DBMS"
DESCRIPTION = "This plugin tests a MySQL DBMS to determine whether it is active and \
accepting queries. It provides the two checks: 'check_mysql' and \
'check_mysql_query'."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-mysql-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "2f4b354626e2b7e8e682a4d01129c8ae59654e1d61724b351d606727025718380e68f3590890581ed2ef2d06993959520b7d467e7e0441218ec71eadb3ea65c5"

RPROVIDES:${PN} += "config-monitoring-plugins-mysql \
monitoring-plugins-mysql \
monitoring-plugins-mysql-query \
nagios-plugins-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
