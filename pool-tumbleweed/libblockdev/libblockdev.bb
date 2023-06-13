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

RPM_NAME = "libblockdev-2.28-1.4.aarch64.rpm"
RPM_HASH = "32c0fccc0c66ba3354911ab77cd77285f1c00681e4cabf35ecd035360b1da3895bcd57f033415d57935bb75e33331bdf473c908733f86826437ef6a4f5ee0f02"

RPROVIDES:${PN} += "config(libblockdev) \
libblockdev \
libblockdev(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblockdev-lvm \
libblockdev.so.2()(64bit) \
libblockdev2 \
libbytesize.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
