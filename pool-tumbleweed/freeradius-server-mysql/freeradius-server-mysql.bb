SUMMARY = "MySQL support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing MySQL support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-mysql-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "06738e53dfc3b4ceee5244120ab442bfa5306b958f1656259fa30b305d5c452d164031bd09c05058374efd39b2faa158180b67450f83bf02a7a13b30f08219df"

RPROVIDES:${PN} += "config-freeradius-server-mysql \
freeradius-server-mysql"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libmariadb.so.3"

inherit rpm
