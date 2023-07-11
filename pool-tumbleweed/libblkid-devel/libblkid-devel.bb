SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libblkid-devel-2.39-1.1.aarch64.rpm"
RPM_HASH = "ae86599eb52b7db5544c114aec59e926a38fdc51acae106b7fadc7d0268308ed90521b990f37379f8f1d8b685b2d838eaa032294fb7c33c64d2c6438649c323a"

RPROVIDES:${PN} += "libblkid-devel \
pkgconfig-blkid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblkid1"

inherit rpm
