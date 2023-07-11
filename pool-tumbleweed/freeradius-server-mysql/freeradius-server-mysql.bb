SUMMARY = "MySQL support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing MySQL support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-mysql-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "05ddbdfd7bf6a0e6bbf433d0da3b690d76205b4768567d68ba4d4c227f31d060d47ca2df9a35e960b242217aa457749e6acf9d89e78002f4eb147d57920cbcbc"

RPROVIDES:${PN} += "config-freeradius-server-mysql \
freeradius-server-mysql"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libmariadb.so.3"

inherit rpm
