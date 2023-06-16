SUMMARY = "Utilities for the Btrfs filesystem"
DESCRIPTION = "Utilities needed to create and maintain btrfs file systems under Linux."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-6.3-1.1.aarch64.rpm"
RPM_HASH = "496d1d69d9dc3055a9af5103f1a4c6bf539c4531174711ed5b1f45f4afc32104623a56c60d94b1ca245f7722a9023b5898d0bbcae847904a27f8a8499b6f61f9"

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
