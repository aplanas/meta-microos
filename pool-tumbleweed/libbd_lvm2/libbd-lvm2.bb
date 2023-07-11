SUMMARY = "The LVM plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides LVM-related functionality."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_lvm2-2.28-1.6.aarch64.rpm"
RPM_HASH = "b3b9c27e30a6c722ffea4db2a8412f68468f53875ad10fdcf54b2222ad42533d4de5b514fc3166aed7c7cbb0f4cca9aa9f52a938d1c0d2aa869344b378bc30df"

RPROVIDES:${PN} += "libbd-lvm.so.2 \
libbd-lvm2 \
libblockdev-lvm"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.2 \
libbd-utils2 \
libc.so.6 \
libdevmapper.so.1.03 \
libglib-2.0.so.0 \
libm.so.6 \
lvm2 \
thin-provisioning-tools"

inherit rpm
