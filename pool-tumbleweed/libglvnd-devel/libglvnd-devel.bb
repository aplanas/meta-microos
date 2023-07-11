SUMMARY = "Development files for libglvnd"
DESCRIPTION = "Vendor-neutral dispatch layer for arbitrating OpenGL API calls between \
multiple vendors on a per-screen basis, as described by Andy Ritger's \
OpenGL ABI proposal. This package contains the required files for \
development."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libglvnd-devel-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "02415ee497a6421a1691f612be7ca48e33da9e44984ed52386c7488cedd9dcc31e7383eb5e079305ae9c6803a472d30f8eef1607e1d9fb37bc40d1bbf29c12a5"

RPROVIDES:${PN} += "libglvnd-devel \
pkgconfig-glx \
pkgconfig-libglvnd \
pkgconfig-opengl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglvnd"

inherit rpm
