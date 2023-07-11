SUMMARY = "Persistent Memory Transactional Object Store library"
DESCRIPTION = "The libpmemobj library provides a transactional object store, \
providing memory allocation, transactions, and general facilities for \
persistent memory programming."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemobj1-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "fb32f0af22af4475ca8e248abb37841248b58901fcd541c011c9fec2d29e4456c69ae4157d66cabbc2fd15b7758dc2a685378ae185d863ae2eb217d3bdeccca2"

RPROVIDES:${PN} += "libpmemobj.so.1 \
libpmemobj1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1"

inherit rpm
