SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libblkid-devel-2.39-3.1.aarch64.rpm"
RPM_HASH = "1879a29fa832f578d594a3fe1179ebe61b044616ae782d963cf7bf0dfcc8222029d68246f504cf0e761b0ef30be79f55fd0d177b41c78f29b07e307243a10088"

RPROVIDES:${PN} += "libblkid-devel \
pkgconfig-blkid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblkid1"

inherit rpm
