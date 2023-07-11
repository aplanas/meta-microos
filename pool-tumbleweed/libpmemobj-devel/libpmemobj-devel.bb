SUMMARY = "Development files for the Persistent Memory Transactional Object Store library"
DESCRIPTION = "The libpmemobj library provides a transactional object store, \
providing memory allocation, transactions, and general facilities for \
persistent memory programming. Developers new to persistent memory \
probably want to start with this library."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemobj-devel-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "f4ce0c9eddd6a4a14535da7bf1f1c61418d52ab0b74fe32c96e5faf0e73bd06b16b416677843bb20e3a6ddada451fdc937e5c948b9a2f3502e73a2f4ce94024f"

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
