SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libfdisk-devel-2.39-3.1.aarch64.rpm"
RPM_HASH = "081dc26c32356029f8284c6152ac886bccf3f4b1c0de38b6f16647ce615f836bb515697a2266bc49d2e692d1b0696511b3f39c6f549ed01ce526489a330ea585"

RPROVIDES:${PN} += "libfdisk-devel \
pkgconfig-fdisk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdisk1 \
pkgconfig-blkid \
pkgconfig-uuid"

inherit rpm
