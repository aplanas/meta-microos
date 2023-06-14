SUMMARY = "Computational Geometry for Octave"
DESCRIPTION = "Library for geometric computing extending MatGeom functions. \
Useful to create, transform, manipulate and display geometric \
primitives. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "octave-forge-geometry-4.0.0-2.8.aarch64.rpm"
RPM_HASH = "491eb1b925724d265e0adb12033d3517298b1320679503af995881053de0ef6ced6e9bc23c5724da6a58006e7ca26571a2470b8cad6c88ee06c83a6c8703cf06"

RPROVIDES:${PN} += "octave-forge-geometry"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli \
octave-forge-matgeom"

inherit rpm
