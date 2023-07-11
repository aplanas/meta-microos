SUMMARY = "Development files for liballegro_memfile"
DESCRIPTION = "Development files needed to build applications which use liballegro_memfile."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_memfile5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "f04941e084957e984af5c837796c04eb837c8a03e91b78a36ffa4338cc36447de9266493341f84c8d1620d78798f55ed4ea17676400bdf3ca02390aa8a9753b2"

RPROVIDES:${PN} += "liballegro-memfile5-2-devel \
pkgconfig-allegro-memfile-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-memfile5-2 \
pkgconfig-allegro-5"

inherit rpm
