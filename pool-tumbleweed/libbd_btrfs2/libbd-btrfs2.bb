SUMMARY = "The BTRFS plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides BTRFS-related functionality."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_btrfs2-2.28-1.6.aarch64.rpm"
RPM_HASH = "6fcfc3473db03e341d9715b3e474eb5874f64e6755897f3fddee69c0d565994ef400fd085487cd7d916328e710323c7364b6d3b608d484f458268bf75e18773c"

RPROVIDES:${PN} += "libbd-btrfs.so.2 \
libbd-btrfs2 \
libblockdev-btrfs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.2 \
libbd-utils2 \
libbytesize.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
