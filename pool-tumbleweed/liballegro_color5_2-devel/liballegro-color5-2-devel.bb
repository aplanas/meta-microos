SUMMARY = "Development files for liballegro_color"
DESCRIPTION = "Development files needed to build applications which use liballegro_color."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_color5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "db37cc9947a53a3d47df3946224b627d3d93dd94ee3513ba196ce7d89bec5703b4ca7caf565899b4fe68b0a48b8d7a21d31bd8d8b57cf755530e5b3836c293fd"

RPROVIDES:${PN} += "liballegro-color5-2-devel \
pkgconfig-allegro-color-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-color5-2 \
pkgconfig-allegro-5"

inherit rpm
