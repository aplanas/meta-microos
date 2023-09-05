SUMMARY = "Utilities for the Btrfs filesystem"
DESCRIPTION = "Utilities needed to create and maintain btrfs file systems under Linux."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-6.3-3.1.aarch64.rpm"
RPM_HASH = "838ab9ebc9f398044d08e454b7868f1ee95fd050ef6aa379b4ccbeff2244e04d6a046b8a6c2b92ff5cbd9516e0ba1aa74a91d595af1a2b92a9225a4dd75365b1"

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
