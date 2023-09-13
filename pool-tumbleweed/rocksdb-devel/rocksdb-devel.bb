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

PV = "8.5.3"

RPM_NAME = "rocksdb-devel-8.5.3-1.1.aarch64.rpm"
RPM_HASH = "8a9db3bee44cc86d9ebd4c06f02857c9bb4f9439cf2623f877e3dd24fb474b9cb3d92f811f3eda0f3d93315ff234b9367d108adddd24076863b040fa4bfb2b59"

RPROVIDES:${PN} += "cmake-RocksDB \
pkgconfig-rocksdb \
rocksdb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librocksdb8"

inherit rpm
