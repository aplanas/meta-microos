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

RPM_NAME = "libpmem-devel-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "44d92ddd62628af2dded263d1f2927b3d94661a9f3feaf4eca9fca8e5f0cc419bb653b974d2359c89b40785b6910b3a8f38e0ae27f55e168115a986b9a35dc04"

RPROVIDES:${PN} += "libpmem-devel \
pkgconfig-libpmem"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem1"

inherit rpm
