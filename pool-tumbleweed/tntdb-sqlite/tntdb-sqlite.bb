SUMMARY = "SQLite plugin for tntdb"
DESCRIPTION = "SQLite plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-sqlite-1.4-1.13.aarch64.rpm"
RPM_HASH = "6a908ae0efc85bfcd650787c25cb7408178f09be01465b70697040b6cd8c24a2f4ac65e8d9a8d45cfea944e8febd3fe70b3396f23b321919d63b02e1ce602efe"

RPROVIDES:${PN} += "tntdb-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
