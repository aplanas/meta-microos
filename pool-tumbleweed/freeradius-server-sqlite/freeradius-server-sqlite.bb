SUMMARY = "SQLite support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing SQLite support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-sqlite-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "e388a25ce6e29a47a800ee266661abcd1d7564ec0b5ddec46dc7efb19c524fd913e41b95181fb83f5cf8e49931db611bcf04515125c70a6deec34d2bb14c7075"

RPROVIDES:${PN} += "config-freeradius-server-sqlite \
freeradius-server-sqlite"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
