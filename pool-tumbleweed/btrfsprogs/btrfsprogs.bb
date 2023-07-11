SUMMARY = "Utilities for the Btrfs filesystem"
DESCRIPTION = "Utilities needed to create and maintain btrfs file systems under Linux."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-6.3-2.2.aarch64.rpm"
RPM_HASH = "7d2647194e52b19c50f30f1c347a9e6fbc494df7e5355b31f1549bdf35c8aa597d8d3db83de944434d806c53542e6d1d8d9bd7c0ce918a5b84c6c874a6e7b63e"

RPROVIDES:${PN} += "btrfs-progs \
btrfs-progs-aarch64 \
btrfsprogs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
btrfsprogs-udev-rules \
coreutils \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcom-err.so.2 \
libext2fs.so.2 \
liblzo2.so.2 \
libudev.so.1 \
libuuid.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
