SUMMARY = "Development files for the Persistent Memory Transactional Object Store library"
DESCRIPTION = "The libpmemobj library provides a transactional object store, \
providing memory allocation, transactions, and general facilities for \
persistent memory programming. Developers new to persistent memory \
probably want to start with this library."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemobj-devel-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "b773a9fa8250dcc64c2406da0e4adab53349d74f699d69455c5e4dcfad575338395ff1f09019b1b743fc2ed77ab1103ece98e9b8413b2423082ed720e3f93f74"

RPROVIDES:${PN} += "libpmemobj-devel \
pkgconfig-libpmemobj"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1 \
libpmemobj1 \
pkgconfig-libdaxctl \
pkgconfig-libndctl \
pkgconfig-libpmem"

inherit rpm
