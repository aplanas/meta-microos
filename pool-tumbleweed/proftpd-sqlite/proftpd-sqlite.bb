SUMMARY = "SQLite Module for ProFTPD"
DESCRIPTION = "This is the SQLite Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-sqlite-1.3.7f-1.3.aarch64.rpm"
RPM_HASH = "962420c803a77c6db9943b47f9d4c01722290b92296e1b713d09ff972417034a54be51897139a52a120653888acbb9bd22c93dc5d01ae8797b7e6071db3be491"

RPROVIDES:${PN} += "proftpd-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
proftpd"

inherit rpm
