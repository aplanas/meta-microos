SUMMARY = "SQLite support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing SQLite support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-sqlite-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "6ab64e440326888ce5ab385fcf1c88a3218a66fbce60d8048916624fbd730750c6573bc704c32f5bef00ace5926d96e2627eae14d36de317ee4c80a6cf3c1e6b"

RPROVIDES:${PN} += "config-freeradius-server-sqlite \
freeradius-server-sqlite"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
