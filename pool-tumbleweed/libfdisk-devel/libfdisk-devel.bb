SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libfdisk-devel-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "2d6ec2de2a50861eb65e82bab877b6fb6b50117fbebad25181b86d403eb6405982208e712a587c9c61efa55a8a291ae836df5d24c4d78adaeff38621ef4b9fb6"

RPROVIDES:${PN} += "libfdisk-devel \
pkgconfig-fdisk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdisk1 \
pkgconfig-blkid \
pkgconfig-uuid"

inherit rpm
