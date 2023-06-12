SUMMARY = "MySQL Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor MySQL server instances."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-mysql-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "203eb57ba8f4ceab70d6904449d969b9b6d60072100e2ced505f633ce416a722100f38aecab8980c5f1937c5496a643691014d3a56249c25e089946d14c1aca9"

RPROVIDES:${PN} += "collectd-plugin-mysql \
collectd-plugin-mysql(aarch-64)"
RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit)"

inherit rpm