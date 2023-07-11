SUMMARY = "SQLite plugin for tntdb"
DESCRIPTION = "Replication plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-replicate-1.4-1.13.aarch64.rpm"
RPM_HASH = "12de7f0ab7fee3383ac8054e395c0478ca4acbc33183ed0509271eb5cf86b0e8aec71fc9c2f4ac8e92ed803d6299fbb153c2e70f12d4a97b2e9d33ad0e658277"

RPROVIDES:${PN} += "tntdb-replicate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
