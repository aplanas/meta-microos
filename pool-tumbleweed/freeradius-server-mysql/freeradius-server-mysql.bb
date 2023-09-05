SUMMARY = "MySQL support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing MySQL support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-mysql-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "37c90854cc8761214f59d268c4526b5bc7cf05209e47adfe4e8db62a429e40ce01789115bd1722b8f9f59c2748f6b040e2542fe16d1877dc5cfbbb5ac8985266"

RPROVIDES:${PN} += "config-freeradius-server-mysql \
freeradius-server-mysql"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libmariadb.so.3"

inherit rpm
