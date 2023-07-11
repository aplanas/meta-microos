SUMMARY = "Development files for liballegro_ttf"
DESCRIPTION = "Development files needed to build applications which use liballegro_ttf."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_ttf5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "d9725b7da0cbbb8cce51bfd3f6c53df536fa7f33a4cb390ecf7a25a5f35fe1aa7321f810cf06ef28b85eb50960f6b39e7371671582fe2517bf4ffa430cc8144f"

RPROVIDES:${PN} += "liballegro-ttf5-2-devel \
pkgconfig-allegro-ttf-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-ttf5-2 \
pkgconfig-allegro-font-5"

inherit rpm
