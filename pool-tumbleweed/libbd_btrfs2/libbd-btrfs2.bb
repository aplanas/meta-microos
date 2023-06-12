SUMMARY = "The BTRFS plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides BTRFS-related functionality."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_btrfs2-2.28-1.4.aarch64.rpm"
RPM_HASH = "261428f15a6d0ab2bf2a2e72188116b67594b53fd0b19b6476bd6b4c9988b63ef66ec81fd02d4820e7a7869ab1126489787f7979bb9d63b56c9b1442ffc7d4c9"

RPROVIDES:${PN} += "libbd_btrfs.so.2()(64bit) \
libbd_btrfs2 \
libbd_btrfs2(aarch-64) \
libblockdev-btrfs"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbd_utils.so.2()(64bit) \
libbd_utils2 \
libbytesize.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
