SUMMARY = "The LVM plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides LVM-related functionality utilizing the LVM DBus API."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_lvm-dbus2-2.28-1.4.aarch64.rpm"
RPM_HASH = "6f45644ad22ee5d6feff81a044073b21a39a3f8213660215e8c89d66b812a3f82d994011e58e0009dd51e2ccada6dc0ad0866cdbc5d214aa4c3bd1095a6cbe2b"

RPROVIDES:${PN} += "config(libbd_lvm-dbus2) \
libbd_lvm-dbus.so.2()(64bit) \
libbd_lvm-dbus2 \
libbd_lvm-dbus2(aarch-64) \
libblockdev-lvm-dbus"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbd_utils.so.2()(64bit) \
libbd_utils2 \
libc.so.6(GLIBC_2.17)(64bit) \
libdevmapper.so.1.03()(64bit) \
libdevmapper.so.1.03(Base)(64bit) \
libdevmapper.so.1.03(DM_1_02_97)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
lvm2 \
thin-provisioning-tools"

inherit rpm
