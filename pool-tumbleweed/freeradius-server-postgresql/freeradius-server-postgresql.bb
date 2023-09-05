SUMMARY = "Postgresql support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing PostgreSQL support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-postgresql-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "30a7d7a1b37222a8bb21744bc3cb42a9d6b79e18ed50b5708b8f55e13b86b56e359ddb5de211dfc03c2a87f23f223377604e9d770726e0fe3247d01fcb1e1f9d"

RPROVIDES:${PN} += "config-freeradius-server-postgresql \
freeradius-server-postgresql"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libpq.so.5"

inherit rpm
