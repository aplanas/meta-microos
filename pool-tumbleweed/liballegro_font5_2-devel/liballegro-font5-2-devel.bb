SUMMARY = "Development files for liballegro_font"
DESCRIPTION = "Development files needed to build applications which use liballegro_font."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_font5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "98d534dc57115f1627708a68521e7388a3084fd85d0d71765c863efac88b02da90c83709e3cb1719d108c5d9574bc5743511ea632b8866d77791f9b1319173ac"

RPROVIDES:${PN} += "liballegro_font5_2-devel \
liballegro_font5_2-devel(aarch-64) \
pkgconfig(allegro_font-5)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro_font5_2 \
pkgconfig(allegro-5)"

inherit rpm
