SUMMARY = "Libraries and header files for meep library"
DESCRIPTION = "Meep (or MEEP) is a free finite-difference time-domain (FDTD) \
simulation software package developed at MIT to model electromagnetic \
systems. \
 \
This package contains libraries and header files for developing \
applications that use meep."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "meep-devel-1.26.0-1.3.aarch64.rpm"
RPM_HASH = "b9b1fde1a46fc8b7eb664b3fb4efdd087b8edc21869eb10ee3815befa55970e76f9237f2eeb44c1d3d9b40f96e01fc3424628140d0a0f759385ea9dd11dda8eb"

RPROVIDES:${PN} += "meep-devel \
pkgconfig-meep"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmeep31"

inherit rpm
