SUMMARY = "The FS plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to operations with file systems."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_fs2-2.28-1.4.aarch64.rpm"
RPM_HASH = "ec87fe23bd343780cb52f4bef1277b5fa44a198a856c9d3b59d0598f5de93d9c3f1b827b23da591c8b4eb8484fce3a67627eda3df2365f1c8d7124c89d4976e0"

RPROVIDES:${PN} += "libbd-fs.so.2 \
libbd-fs2 \
libblockdev-fs"

RDEPENDS:${PN} += "/sbin/ldconfig \
device-mapper \
ld-linux-aarch64.so.1 \
libbd-part-err.so.2 \
libbd-utils.so.2 \
libbd-utils2 \
libblkid.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmount.so.1 \
libparted-fs-resize.so.0 \
libparted.so.2"

inherit rpm
