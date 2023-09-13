SUMMARY = "Utilities for the Btrfs filesystem"
DESCRIPTION = "Utilities needed to create and maintain btrfs file systems under Linux."
LICENSE = "GPL-2.0-only"

PV = "6.5"

RPM_NAME = "btrfsprogs-6.5-1.1.aarch64.rpm"
RPM_HASH = "c3f5278718e07159dfa8f3edce2adf0960be7281aa61acc9cceaee96c482d7961ee914d0b18a4a6dfda76e8683517d7d224e0f91e3afc5bb0c86ac2bd9d1b4d7"

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
