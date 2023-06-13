SUMMARY = "Apache Portable Runtime (APR) Library"
DESCRIPTION = "APR is Apache's Portable Runtime Library, designed to be a support \
library that provides a predictable and consistent interface to \
underlying platform-specific implementations. \
 \
The range of platform-spanning functionality provided by APR \
includes: Memory allocation and memory pool functionality, atomic \
operations, dynamic library handling, file I/O, command-argument \
parsing, locking, hash tables and arrays, mmap functionality, network \
sockets and protocols, threads, process and mutex functionality, \
shared memory functionality, time routines, as well as user and group \
ID services."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "libapr1-0-1.7.4-1.1.aarch64.rpm"
RPM_HASH = "6eeb132f07ce749b1cd67de8110cd9c3f67762057805b08ac849840313cacd400237ecbb5358697b67e7a3599ae18b6f90718a491ce7966674151a413d8e8224"

RPROVIDES:${PN} += "libapr-1.so.0()(64bit) \
libapr1-0 \
libapr1-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
