SUMMARY = "The LVM plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides LVM-related functionality."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_lvm2-2.28-1.4.aarch64.rpm"
RPM_HASH = "75aea969c6e84d8730821e3edb0666e906a86e92c47e6822667e5f48a218abb1f7882e7eb611882493fe7b9748d0f61f479fee7cd8e132857dd3be6c4590f128"

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
