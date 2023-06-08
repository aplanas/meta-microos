SUMMARY = "Postgresql support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing PostgreSQL support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-postgresql-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "0317a537fbf14dfa7da4a432aa5967b6a7cef441acf7ab59df9120f2a817be78508e92d937abcb8e146f232a0af40c9876edfb75c5c4e22adf563a7295fb8356"

RPROVIDES:${PN} += "config(freeradius-server-postgresql) freeradius-server-postgresql freeradius-server-postgresql(aarch-64)"
RDEPENDS:${PN} += "freeradius-server libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit)"

inherit rpm
