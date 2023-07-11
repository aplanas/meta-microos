SUMMARY = "Development files for the low-level persistent memory library"
DESCRIPTION = "libpmem provides low level persistent memory support. In particular, \
support for the persistent memory instructions for flushing changes \
to pmem is provided. \
 \
This library is provided for software which tracks every store to \
pmem and needs to flush those changes to durability. Most developers \
will find higher level libraries like libpmemobj to be much more \
convenient."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmem-devel-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "c9f2a3fa832e6c725e24488043c6cb48604c74541e3ac38cf4d9cdab2b83ff9e5afc29dad73a6e3705ffd91e249a6fc83f50c50fa950d4bcf89b1ed1cc72b31e"

RPROVIDES:${PN} += "libpmem-devel \
pkgconfig-libpmem"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem1"

inherit rpm
