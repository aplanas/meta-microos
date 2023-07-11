SUMMARY = "The FS plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to operations with file systems."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_fs2-2.28-1.6.aarch64.rpm"
RPM_HASH = "d79a703209ed14950bcf02ed05ac3182c15079ec112500248a3bf5f222b8d1a16c62b87c4972a6049ad15bed9d33f2e8fbca706a53a05b795dc8140056e31b3e"

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
