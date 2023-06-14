SUMMARY = "The Device Mapper plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to Device Mapper."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_dm2-2.28-1.4.aarch64.rpm"
RPM_HASH = "3d616c832b40c9630dba2911a338b80686dd4ec15614fc0d0b7185cb0fe7a55cc8285d37d3cba3e0b1b079b6c8a7763b49c23bc32168f8f8d2d4bbe064016211"

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
