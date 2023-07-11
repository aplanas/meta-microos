SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libfdisk-devel-2.39-1.1.aarch64.rpm"
RPM_HASH = "bb89078c1c4fa1123af3c18e0c197cce5d07f6bb4741c2b0701cea379e0e14fb42f3281e38ca970c9265198683c294e00d09867898f61e6466349b28024fe82d"

RPROVIDES:${PN} += "libfdisk-devel \
pkgconfig-fdisk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdisk1 \
pkgconfig-blkid \
pkgconfig-uuid"

inherit rpm
