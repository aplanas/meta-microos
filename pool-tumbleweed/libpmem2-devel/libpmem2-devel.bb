SUMMARY = "Development files for the low-level persistent memory library"
DESCRIPTION = "libpmem2 provides low level persistent memory support. In particular, \
support for the persistent memory instructions for flushing changes \
to pmem is provided. \
 \
This library is provided for software which tracks every store to \
pmem and needs to flush those changes to durability. Most developers \
will find higher level libraries like libpmemobj to be much more \
convenient. libpmem2 has a new API that addresses many of the shortcommings \
of libpmem1"
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmem2-devel-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "b0e8d01448028951c297f70b2d41bcb914af20ca1b6cf210e4146dbf5f0d326a73364f9eb4c5abd904353d85c4b882bca4dab0c662d3bbf2865e49745cfbb251"

RPROVIDES:${PN} += "libpmem2-devel \
pkgconfig-libpmem2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem2-1"

inherit rpm
