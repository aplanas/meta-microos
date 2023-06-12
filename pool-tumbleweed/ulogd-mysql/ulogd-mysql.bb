SUMMARY = "MySQL output target for ulogd"
DESCRIPTION = "MySQL output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.7"

RPM_NAME = "ulogd-mysql-2.0.7-6.8.aarch64.rpm"
RPM_HASH = "3bdee71ffdc8536aa32686c7325e1fc6751df09d1db80d86a20aff588e59b81698586acea44652c1f2d1c5a3d97e272e84f50497b2221d7068ed1af29bec9083"

RPROVIDES:${PN} += "ulogd-mysql \
ulogd-mysql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
ulogd"

inherit rpm
