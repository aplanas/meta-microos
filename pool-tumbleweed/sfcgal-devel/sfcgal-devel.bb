SUMMARY = "Development files and tools for SFCGAL applications"
DESCRIPTION = "Content headers & files to envelopment files for libSFCGAL1"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "sfcgal-devel-1.4.1-4.5.aarch64.rpm"
RPM_HASH = "c24e353544b77d2d954f44b165d63b9f4ac4ef4478f5b63e12de085feda3049583ab95efd28079b55a9839b9b53949cebf3f493bfdc3b7a824ca4e5a60319a19"

RPROVIDES:${PN} += "pkgconfig-sfcgal \
sfcgal-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libSFCGAL1"

inherit rpm
