SUMMARY = "GNU partitioner"
DESCRIPTION = "GNU Parted is a program for creating, destroying, resizing, checking, \
and copying partitions, and the file systems on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "parted-3.5-4.4.aarch64.rpm"
RPM_HASH = "432371c8a27ad8e796c8a6adbdd46356509a715cead221a443cad30583f8ecc38045684338a02417c6900c3cdfb79482511ff6097344162ac4dd6f267a2f8849"

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
