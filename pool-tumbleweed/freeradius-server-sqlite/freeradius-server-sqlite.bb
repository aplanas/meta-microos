SUMMARY = "SQLite support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing SQLite support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-sqlite-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "47a9beed920cf2193d9e798c9053f43f3cde8fafbd7544418ce113de94fd19ac0ff39b54a4bd55a0b4d51fd07322084f0e509d65d48e1a36a2094ec61a990a02"

RPROVIDES:${PN} += "config-freeradius-server-sqlite \
freeradius-server-sqlite"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
