SUMMARY = "SQLite plugin for tntdb"
DESCRIPTION = "SQLite plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-sqlite-1.4-1.12.aarch64.rpm"
RPM_HASH = "4b8da10d971565e69a5ee682dcc257a12956a1fe274be8bd6a98ebe952575e18b418ed7252d85f02dc48eb27ae948f19f1d527a3360507439d5140a105924213"

RPROVIDES:${PN} += "tntdb-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
