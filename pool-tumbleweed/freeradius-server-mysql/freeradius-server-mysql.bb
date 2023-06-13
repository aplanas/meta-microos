SUMMARY = "MySQL support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing MySQL support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-mysql-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "11e12f578a8b1e69491fe299e788dfd30672ccbbb73a0929f472bb04ab57d090ef605564c294694b874ac13cb9b59c80cc8c715dc34332ad474fde47db89e59b"

RPROVIDES:${PN} += "config(freeradius-server-mysql) \
freeradius-server-mysql \
freeradius-server-mysql(aarch-64)"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6(GLIBC_2.17)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit)"

inherit rpm
