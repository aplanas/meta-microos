SUMMARY = "PostgreSQL plugin for tntdb"
DESCRIPTION = "PostgreSQL plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-postgresql-1.4-1.12.aarch64.rpm"
RPM_HASH = "8d14f66ccc4041f0de4f8c245593edea8dc8cd3f9436428857455ee8011d44d349fe21ca0aaed1ccd5c6bc3fd6b42b8e0050a901a89d25cbdd67c69bd3ca1f38"

RPROVIDES:${PN} += "tntdb-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
