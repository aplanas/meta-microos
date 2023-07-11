SUMMARY = "The LVM plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides LVM-related functionality utilizing the LVM DBus API."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_lvm-dbus2-2.28-1.6.aarch64.rpm"
RPM_HASH = "0d4594b2b4aa645baa1e9d24f3e48a5049aa48115f28f6ab84c1ca56c3f5122cdb5c3cd813cfe07669d17d204a14d52060ce6b72ebf566ef9871efe4da41ec95"

RPROVIDES:${PN} += "config-libbd-lvm-dbus2 \
libbd-lvm-dbus.so.2 \
libbd-lvm-dbus2 \
libblockdev-lvm-dbus"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.2 \
libbd-utils2 \
libc.so.6 \
libdevmapper.so.1.03 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libm.so.6 \
lvm2 \
thin-provisioning-tools"

inherit rpm
