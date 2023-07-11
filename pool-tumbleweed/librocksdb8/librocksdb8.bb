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

RPM_NAME = "librocksdb8-8.1.1-1.2.aarch64.rpm"
RPM_HASH = "4f483652ba9093fd64eb146f13c2173275b0cca5aee10431ffdf3612932ef99657c70263be6ee731de08b61608876f9dce6a4bae5e23cd9fe69964de70c159f8"

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
