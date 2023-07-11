SUMMARY = "Development files for the Persistent Memory Resident Log File library"
DESCRIPTION = "The libpmemlog library provides a pmem-resident log file. This \
library is provided for cases requiring an append-mostly file to \
record variable length entries. Most developers will find higher \
level libraries like libpmemobj to be more generally useful."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemlog-devel-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "60676630c115e3cd66f8fd546a44fdd2e28a1a705cd9bf379d1dec4e2cf17671c17733087e2c0f6eb07292cde03d8c64ebd2ff4e7a13a55f0416b1aa9c5e8eca"

RPROVIDES:${PN} += "libpmemlog-devel \
pkgconfig-libpmemlog"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1 \
libpmemlog1 \
pkgconfig-libdaxctl \
pkgconfig-libndctl \
pkgconfig-libpmem"

inherit rpm
