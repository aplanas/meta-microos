SUMMARY = "Utility tools for RocksDB"
DESCRIPTION = "RocksDB is a high performance embedded database for key-value data. \
This package contains utility tools for RocksDB."
LICENSE = "(Apache-2.0 | GPL-2.0-only) & BSD-2-Clause"

PV = "8.5.3"

RPM_NAME = "rocksdb-tools-8.5.3-1.1.aarch64.rpm"
RPM_HASH = "853628112af4b4500d19dad98b350e8c4a73865fda5b359802f63f9887f694e557ea83530e5a92e5d5ce2eaa8c952a3a6c7179dd1a11c09a89a504667f2c5eb6"

RPROVIDES:${PN} += "rocksdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librocksdb.so.8 \
libstdc++.so.6"

inherit rpm
