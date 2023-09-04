SUMMARY = "KIWI - host requirements for filesystems"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build filesystem images"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "kiwi-systemdeps-filesystems-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "92b5defd8bd8ebea39323585bdeb0a8ff67c8ad24244c8596b51d1ce325f7de36318c7e5dade074068d633547465638c9d50fda84ca8bb17ff2a5f09cf0ac6a2"

RPROVIDES:${PN} += "kiwi-filesystem-btrfs \
kiwi-filesystem-ext2 \
kiwi-filesystem-ext3 \
kiwi-filesystem-ext4 \
kiwi-filesystem-requires \
kiwi-filesystem-squashfs \
kiwi-filesystem-xfs \
kiwi-image-kis \
kiwi-image-pxe \
kiwi-image-pxe-requires \
kiwi-systemdeps-filesystems"

RDEPENDS:${PN} += "btrfsprogs \
dosfstools \
e2fsprogs \
kiwi-systemdeps-core \
qemu-tools \
squashfs \
xfsprogs"

inherit rpm
