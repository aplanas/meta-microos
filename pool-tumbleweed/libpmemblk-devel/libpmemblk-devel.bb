SUMMARY = "Development files for the Persistent Memory Resident Block library"
DESCRIPTION = "libpmemblk implements a pmem-resident array of blocks, all the same \
size, where a block is updated atomically with respect to power \
failure or program interruption (no torn blocks). \
 \
For example, a program keeping a cache of fixed-size objects in pmem \
might find this library useful. This library is provided for cases \
requiring large arrays of objects at least 512 bytes each. Most \
developers will find higher level libraries like libpmemobj to be \
more generally useful."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemblk-devel-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "6a8b2a69e6220a2ea3d748e6495a0fdc41f75e5c23a2369276a00307a1913626aab03cdcb153a65261521c94733325ae58d6c8556d1dbdcdafe7f86bfb62c4fe"

RPROVIDES:${PN} += "libpmemblk-devel \
pkgconfig-libpmemblk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1 \
libpmemblk1 \
pkgconfig-libdaxctl \
pkgconfig-libndctl \
pkgconfig-libpmem"

inherit rpm
