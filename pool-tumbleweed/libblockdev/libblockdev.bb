SUMMARY = "A library for low-level manipulation with block devices"
DESCRIPTION = "The LibBlockDev is a C library with GObject introspection support that can be \
used for doing low-level operations with block devices, like setting up LVM, \
BTRFS, LUKS or MD RAID. The library uses plugins (LVM, BTRFS,...) and serves as \
a wrapper around its plugins' functionality. All the plugins, however, can \
be used as standalone libraries. One of the core principles of LibBlockDev is \
that it is stateless from the storage configuration's perspective (e.g. it has \
no information about VGs when creating an LV)."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libblockdev-2.28-1.6.aarch64.rpm"
RPM_HASH = "1eb29e12f1159ba957e6b82b15711e09d30259b9a24743f93aed31396ccab72f37240a0c45601bb8b72746c11b8bea38aa8a64546193e8674aab9cb12a9b4313"

RPROVIDES:${PN} += "config-libblockdev \
libblockdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblockdev-lvm \
libblockdev.so.2 \
libblockdev2 \
libbytesize.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
