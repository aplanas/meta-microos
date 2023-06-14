SUMMARY = "SQLite plugin for tntdb"
DESCRIPTION = "Replication plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-replicate-1.4-1.12.aarch64.rpm"
RPM_HASH = "9e33751d1c6f758461def69c6e5c7fd4efb9e770d13e21aaed84d8bc1af2e4eaac9172a78cbdddf16baf48b8512ba885120bdc8e3df95fa919488e5a3912ed12"

RPROVIDES:${PN} += "tntdb-replicate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
