SUMMARY = "Postgresql support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing PostgreSQL support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-postgresql-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "c5a6851bd0d016456289c01c8eb3ab514f5b662bd15dc609559e0a310699f397f973327bdd3cee34f2f853e95ce7247e45801d377b308fbd8cde2a4782a4a9ff"

RPROVIDES:${PN} += "config-freeradius-server-postgresql \
freeradius-server-postgresql"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libpq.so.5"

inherit rpm
