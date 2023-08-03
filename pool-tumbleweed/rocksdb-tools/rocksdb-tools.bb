SUMMARY = "Utility tools for RocksDB"
DESCRIPTION = "RocksDB is a high performance embedded database for key-value data. \
This package contains utility tools for RocksDB."
LICENSE = "(Apache-2.0 | GPL-2.0-only) & BSD-2-Clause"

PV = "8.3.2"

RPM_NAME = "rocksdb-tools-8.3.2-1.1.aarch64.rpm"
RPM_HASH = "ed6e35ca469edc45981557f24694823b8df5be9a96fb6f8fbab90186f5c14d893449651d7d19a69dc4729ca7fbe9cca9ab3380f2deebd4978833267be1b695fa"

RPROVIDES:${PN} += "rocksdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librocksdb.so.8 \
libstdc++.so.6"

inherit rpm
