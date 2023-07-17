SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libfdisk-devel-2.39-2.1.aarch64.rpm"
RPM_HASH = "b692554dadc5aa74484a0d036a751d60b0a56ccad403d9b92502968ff798e23273c27a9bd0a71d8487d7c5500b0e720137c78077fe2d33f1dfab1852641d60cd"

RPROVIDES:${PN} += "libfdisk-devel \
pkgconfig-fdisk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdisk1 \
pkgconfig-blkid \
pkgconfig-uuid"

inherit rpm
