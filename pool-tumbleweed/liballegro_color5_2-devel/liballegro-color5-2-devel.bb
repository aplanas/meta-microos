SUMMARY = "Development files for liballegro_color"
DESCRIPTION = "Development files needed to build applications which use liballegro_color."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_color5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "2afb0379e68add1c692f17f82e5c86431eb636600248ddfd11105da3f5b17d977e0cf59817bc3a753eeb2eae3e7c54a58a66acc2a9d78a2feb353452cd5d114f"

RPROVIDES:${PN} += "liballegro-color5-2-devel \
pkgconfig-allegro-color-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-color5-2 \
pkgconfig-allegro-5"

inherit rpm
