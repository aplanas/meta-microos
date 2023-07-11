SUMMARY = "Development files for liballegro_font"
DESCRIPTION = "Development files needed to build applications which use liballegro_font."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_font5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "960e1a6f2c4e0a2554d90124910e25d0bc49ff831dafb4a08533b62cf06b6db418352ba2f28d16104eca1bc148e9a8fd0128e7b945e5e9d0d949cdebb4c8a914"

RPROVIDES:${PN} += "liballegro-font5-2-devel \
pkgconfig-allegro-font-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-font5-2 \
pkgconfig-allegro-5"

inherit rpm
