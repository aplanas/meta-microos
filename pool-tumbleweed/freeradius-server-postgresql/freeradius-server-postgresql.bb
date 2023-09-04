SUMMARY = "Postgresql support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing PostgreSQL support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-postgresql-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "9114a444f6fbf4a036b91c26067e31303eb424dd719349df28fc543b5aa36f098e180df6995ef827d6c4d03b869cc6d9dee3a90c601516697dd35a9ed179b15c"

RPROVIDES:${PN} += "config-freeradius-server-postgresql \
freeradius-server-postgresql"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libpq.so.5"

inherit rpm
