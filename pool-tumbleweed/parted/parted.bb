SUMMARY = "GNU partitioner"
DESCRIPTION = "GNU Parted is a program for creating, destroying, resizing, checking, \
and copying partitions, and the file systems on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "parted-3.5-4.5.aarch64.rpm"
RPM_HASH = "b21cff72f5dd2551e3343a31515f43b2a4e45d48e2184312f50c56b18f1b02647387a8c4236b4aefd1113ab5ae2950ee24047fd226a50dedc697d26accc0ae83"

RPROVIDES:${PN} += "parted"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libparted-fs-resize.so.0 \
libparted.so.2 \
libreadline.so.8 \
libtinfo.so.6 \
libuuid.so.1"

inherit rpm
