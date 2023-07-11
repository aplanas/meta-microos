SUMMARY = "The Device Mapper plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to Device Mapper."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_dm2-2.28-1.6.aarch64.rpm"
RPM_HASH = "19cb2880fd834c32ec5905f277b38ceb3aac8117ed398d593130b3d60ab2b5238c9f2fda707911b450dab8ab2ba9e5056abeb853eb40f80abab8dbbab9026a51"

RPROVIDES:${PN} += "libbd-dm.so.2 \
libbd-dm2 \
libblockdev-dm"

RDEPENDS:${PN} += "/sbin/ldconfig \
device-mapper \
dmraid \
ld-linux-aarch64.so.1 \
libbd-utils.so.2 \
libbd-utils2 \
libc.so.6 \
libdevmapper.so.1.03 \
libdmraid.so.1 \
libglib-2.0.so.0 \
libudev.so.1"

inherit rpm
