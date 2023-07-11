SUMMARY = "The partitioning plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to partitioning."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_part2-2.28-1.6.aarch64.rpm"
RPM_HASH = "0fb1631888b508deff7f8b32a7ad533f853934deeba2bee3e4eaf7c55b996537826700488edfb35cce9b2f5937bfa43f62b829b1175c564e51150f506e89027f"

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
