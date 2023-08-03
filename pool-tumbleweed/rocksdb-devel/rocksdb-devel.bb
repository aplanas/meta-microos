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

PV = "8.3.2"

RPM_NAME = "rocksdb-devel-8.3.2-1.1.aarch64.rpm"
RPM_HASH = "2f1caaead106e8f8d0c1330e943d7b9a8dfd1f47bd557655b27ca7b08b45709fb45ea4c0621425e06528e6a0c57a6ba0d50ce49618449f311589b3be99327574"

RPROVIDES:${PN} += "cmake-RocksDB \
pkgconfig-rocksdb \
rocksdb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librocksdb8"

inherit rpm
