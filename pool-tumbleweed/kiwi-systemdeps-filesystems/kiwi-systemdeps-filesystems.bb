SUMMARY = "KIWI - host requirements for filesystems"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build filesystem images"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-filesystems-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "afa723df5f366a9f5ab871dbd4c997a2ae25afcfd73c6adddd340d36a3b8bd2c6468104e59edfeed56bdb79b1edb2e51549ebc33ad757e306dfdc973697efd9c"

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
