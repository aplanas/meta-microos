SUMMARY = "Computational Geometry for Octave"
DESCRIPTION = "Library for geometric computing extending MatGeom functions. \
Useful to create, transform, manipulate and display geometric \
primitives. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "octave-forge-geometry-4.0.0-2.9.aarch64.rpm"
RPM_HASH = "b7eef6003b2e9a4fcd579b91bbda0bb70a749107db97868911270fcd7dc322b141f2cc78e6321c650f959cf40903b1743206e9bb2d9b520e879684b3a182175c"

RPROVIDES:${PN} += "octave-forge-geometry"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli \
octave-forge-matgeom"

inherit rpm
