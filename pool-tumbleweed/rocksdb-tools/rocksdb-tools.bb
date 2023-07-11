SUMMARY = "Utility tools for RocksDB"
DESCRIPTION = "RocksDB is a high performance embedded database for key-value data. \
This package contains utility tools for RocksDB."
LICENSE = "(Apache-2.0 | GPL-2.0-only) & BSD-2-Clause"

PV = "8.1.1"

RPM_NAME = "rocksdb-tools-8.1.1-1.2.aarch64.rpm"
RPM_HASH = "92b82ac19a09cf6c59fcd4e7f93093180b0789233b19f99f691dbfa49bd0e1e36db673697f4ea80880f7fba7e7d319087235e594b747651d9dc536563d82cbd5"

RPROVIDES:${PN} += "rocksdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librocksdb.so.8 \
libstdc++.so.6"

inherit rpm
