SUMMARY = "A key/value-store"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "leveldb-1.23-2.4.aarch64.rpm"
RPM_HASH = "2792bc8af0c24f7d108444c37263c01864e749f7490ab63f73351a021450237224adfc655b6026d43b95d4fcce3099ed439e3257b0114d3c263776f513ba928e"

RPROVIDES:${PN} += "leveldb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsnappy.so.1 \
libstdc++.so.6"

inherit rpm
