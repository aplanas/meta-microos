SUMMARY = "Development package for RocksDB"
DESCRIPTION = "RocksDB is a high performance embedded database for key-value data. \
It is a fork of LevelDB which was then optimized to exploit many \
central processing unit (CPU) cores, and make efficient use of fast \
storage, such as solid-state drives (SSD), for input/output (I/O) \
bound workloads. It is based on a log-structured merge-tree (LSM tree) \
data structure. \
 \
This package contains the files needed to compile programs that use \
the RocksDB library."
LICENSE = "(Apache-2.0 | GPL-2.0-only) & BSD-2-Clause"

PV = "8.1.1"

RPM_NAME = "rocksdb-devel-8.1.1-1.1.aarch64.rpm"
RPM_HASH = "ff4ce2682d1628956126d1d7b64091150691b7415ee112b4499162da53df77a90415da938e8d3c80c147cd34aa354a7c780c094f0405f3240b51492714f36503"

RPROVIDES:${PN} += "cmake(RocksDB) \
pkgconfig(rocksdb) \
rocksdb-devel \
rocksdb-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
librocksdb8"

inherit rpm
