SUMMARY = "Shared library from rocksdb"
DESCRIPTION = "RocksDB is a high performance embedded database for key-value data. \
It is a fork of LevelDB which was then optimized to exploit many \
central processing unit (CPU) cores, and make efficient use of fast \
storage, such as solid-state drives (SSD), for input/output (I/O) \
bound workloads. It is based on a log-structured merge-tree (LSM tree) \
data structure. \
 \
This package holds the shared library of rocksdb."
LICENSE = "(Apache-2.0 | GPL-2.0-only) & BSD-2-Clause"

PV = "8.1.1"

RPM_NAME = "librocksdb8-8.1.1-1.1.aarch64.rpm"
RPM_HASH = "e2f3cfd16998b1a6632c0d47be611e0738fcc2ef0914b8fea55a457e04d0a5f830df2946cff676b26876b336d88b46d5b9f6f66765179ec911923f7493d84563"

RPROVIDES:${PN} += "librocksdb.so.8 \
librocksdb8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgflags.so.2.2 \
liblz4.so.1 \
libm.so.6 \
libsnappy.so.1 \
libstdc++.so.6 \
liburing.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
