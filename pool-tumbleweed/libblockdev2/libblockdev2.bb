SUMMARY = "A library for low-level manipulation with block devices"
DESCRIPTION = "The LibBlockDev is a C library with GObject introspection support that can be \
used for doing low-level operations with block devices like setting up LVM, \
BTRFS, LUKS or MD RAID. The library uses plugins (LVM, BTRFS,...) and serves as \
a wrapper around its plugins' functionality. All the plugins, however, can \
be used as standalone libraries. One of the core principles of LibBlockDev is \
that it is stateless from the storage configuration's perspective (e.g. it has \
no information about VGs when creating an LV)."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libblockdev2-2.28-1.4.aarch64.rpm"
RPM_HASH = "f9cec9e113baffe26154f008dd9deb3d9c4d70720454bd646cd7f67e1ebe115daaee7a1cac0ee9984a8dc50f333d1d6f97828d8fe3353c346cbef5327d702f67"

RPROVIDES:${PN} += "libblockdev.so.2()(64bit) \
libblockdev2 \
libblockdev2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbd_utils.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
