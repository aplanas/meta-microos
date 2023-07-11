SUMMARY = "Library for manipulating partitions"
DESCRIPTION = "Libparted is a library for creating, destroying, resizing, checking \
and copying partitions and the file systems on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "libparted-fs-resize0-3.5-4.5.aarch64.rpm"
RPM_HASH = "b0649a46404e83e211b4d8c31b1c0cb8bdd958d7f4d62870724375e67c53e4ca579b3c5b640da70c2f795336e68a7babff6486de503eba87f88bfe9c3c87cac4"

RPROVIDES:${PN} += "libparted-fs-resize.so.0 \
libparted-fs-resize0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
