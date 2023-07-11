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

RPM_NAME = "rocksdb-devel-8.1.1-1.2.aarch64.rpm"
RPM_HASH = "74fe02010e32a7ff2afb6f7a304c8a400096ad8bc83c9698bc98e08a3d52fd96e011af14f2327567b64154e4856475bc955843016165045d9c37e59b62633896"

RPROVIDES:${PN} += "cmake-RocksDB \
pkgconfig-rocksdb \
rocksdb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librocksdb8"

inherit rpm
