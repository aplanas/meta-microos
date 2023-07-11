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

RPM_NAME = "libblockdev2-2.28-1.6.aarch64.rpm"
RPM_HASH = "ad40c6b7135d5ed8cbd22927fc0198863d7abf58745ceeacc64d1e3a9a5e2735b787b6601e0cb4d69dba4212407d13984911e7649062fdb9fd41112aaab53464"

RPROVIDES:${PN} += "libblockdev.so.2 \
libblockdev2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
