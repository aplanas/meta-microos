SUMMARY = "Library for manipulating partitions"
DESCRIPTION = "Libparted is a library for creating, destroying, resizing, checking \
and copying partitions and the file systems on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "libparted2-3.5-4.5.aarch64.rpm"
RPM_HASH = "0a0e1f0ae451bcc861e7a58ce5197aab9d64943d1cd735f53420b8f92cace7fd78f14f454d4db19ffbfed1dff441989cee5dbc7517261b17a57ef57367893a40"

RPROVIDES:${PN} += "libparted.so.2 \
libparted2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libuuid.so.1"

inherit rpm
