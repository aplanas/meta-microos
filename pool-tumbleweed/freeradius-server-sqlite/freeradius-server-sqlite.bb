SUMMARY = "SQLite support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing SQLite support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-sqlite-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "28b0b5af5ed73a291edc4d81fc86fe98e295789a8530cef46a27c2ee4599575006c80f0e8615d9f8b4a03bba8db1526fafee265d8e7a4e99bb02118f1b6d814c"

RPROVIDES:${PN} += "config(freeradius-server-sqlite) \
freeradius-server-sqlite \
freeradius-server-sqlite(aarch-64)"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6(GLIBC_2.33)(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
