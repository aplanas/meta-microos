SUMMARY = "Development files for liballegro_physfs"
DESCRIPTION = "Development files needed to build applications which use liballegro_physfs."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_physfs5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "a43d6f9105a13e6bd01a0a249ac0ff1bf1fcb8d1a7cada4a8eeec314a94f8f8505e7f51a614193950622ff1c0b357d9c6d970b054007889d677b643dfb3dca13"

RPROVIDES:${PN} += "liballegro-physfs5-2-devel \
pkgconfig-allegro-physfs-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-physfs5-2 \
pkgconfig-allegro-5"

inherit rpm
