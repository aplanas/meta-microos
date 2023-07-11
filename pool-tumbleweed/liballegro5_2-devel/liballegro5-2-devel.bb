SUMMARY = "Development files for liballegro"
DESCRIPTION = "Development files needed to build applications which use liballegro."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "c8c9f3f399a9fc20c0b7f366ae68126c7bdf7f959c7b6b583e9babeaa3d01f086f8efbfa9b9ab87aa8d1350807aea95d3fc2f38531670f98605f2eabb5e547df"

RPROVIDES:${PN} += "liballegro5-2-devel \
pkgconfig-allegro-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro5-2 \
pkgconfig-gl \
pkgconfig-x11"

inherit rpm
