SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libfdisk-devel-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "6ce7c08170eb8b5ac9b9d0b1ae1bce1eaec410e1d90dae90b2d2798c59ed9743ef27b140f1875f87f87fe3905c6ed42c01ba8a5a3f59e56a64c51ec4019c045a"

RPROVIDES:${PN} += "libfdisk-devel \
pkgconfig-fdisk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdisk1 \
pkgconfig-blkid \
pkgconfig-uuid"

inherit rpm
