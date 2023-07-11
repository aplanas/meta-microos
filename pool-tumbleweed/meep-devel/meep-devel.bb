SUMMARY = "Libraries and header files for meep library"
DESCRIPTION = "Meep (or MEEP) is a free finite-difference time-domain (FDTD) \
simulation software package developed at MIT to model electromagnetic \
systems. \
 \
This package contains libraries and header files for developing \
applications that use meep."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "meep-devel-1.26.0-1.4.aarch64.rpm"
RPM_HASH = "2a86dc78f1ef194d9af8f1872af02b6074a13ca617b5c520dcc8298d060b77d5f95bff8a509db49aa81d5c906e4b065f696f2f303888f6ee83d4bfe5b585a573"

RPROVIDES:${PN} += "meep-devel \
pkgconfig-meep"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmeep31"

inherit rpm
