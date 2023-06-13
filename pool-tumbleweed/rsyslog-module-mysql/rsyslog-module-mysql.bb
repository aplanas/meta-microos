SUMMARY = "MySQL support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides a module with the support for logging into MySQL \
databases."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-mysql-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "613e29995bbcc53ba24a55541f400ff246f5ee61793003ce5d9db99717f12cf299bae72539b0bba40820c2677002a4f1ede39339d9285bee79475a8df83ee466"

RPROVIDES:${PN} += "config(rsyslog-module-mysql) \
rsyslog-module-mysql \
rsyslog-module-mysql(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
rsyslog"

inherit rpm
