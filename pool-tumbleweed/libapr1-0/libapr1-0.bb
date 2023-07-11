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

RPM_NAME = "libapr1-0-1.7.4-1.2.aarch64.rpm"
RPM_HASH = "7bb061ad2c4026a583835fb7456df72ba3a7945f2452d6914ac27e46bdb9f0ea1e35522ac5d3e59229f637b054af4b7ce4673b8a065c989678e706dab767ad5f"

RPROVIDES:${PN} += "libapr-1.so.0 \
libapr1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
