SUMMARY = "The partitioning plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to partitioning."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_part2-2.28-1.4.aarch64.rpm"
RPM_HASH = "5a93652bd0d33c702fb3a0fca17d87ce983e3c479f94702e66b5f0ff4712657c1bcd39831915d2125984f19072012810888bd50901d217a07c787e96434288cb"

RPROVIDES:${PN} += "libbd-part.so.2 \
libbd-part2 \
libblockdev-part"

RDEPENDS:${PN} += "/sbin/ldconfig \
gptfdisk \
ld-linux-aarch64.so.1 \
libbd-part-err.so.2 \
libbd-utils.so.2 \
libbd-utils2 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
libparted.so.2 \
util-linux"

inherit rpm
