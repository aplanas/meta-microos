SUMMARY = "Test a MySQL DBMS"
DESCRIPTION = "This plugin tests a MySQL DBMS to determine whether it is active and \
accepting queries. It provides the two checks: 'check_mysql' and \
'check_mysql_query'."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-mysql-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "9d3d82e2b8e71b564c199942cd440d31348e625c804ed08d1965433680eef5d4ab73500888b67a5820fc8fa27e158f7771accf6295cb5c95fbf102d75c8ae4e9"

RPROVIDES:${PN} += "config(monitoring-plugins-mysql) \
monitoring-plugins-mysql \
monitoring-plugins-mysql(aarch-64) \
monitoring-plugins-mysql_query \
nagios-plugins-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit)"

inherit rpm
