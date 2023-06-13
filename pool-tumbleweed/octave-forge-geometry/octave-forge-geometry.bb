SUMMARY = "Computational Geometry for Octave"
DESCRIPTION = "Library for geometric computing extending MatGeom functions. \
Useful to create, transform, manipulate and display geometric \
primitives. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "octave-forge-geometry-4.0.0-2.8.aarch64.rpm"
RPM_HASH = "491eb1b925724d265e0adb12033d3517298b1320679503af995881053de0ef6ced6e9bc23c5724da6a58006e7ca26571a2470b8cad6c88ee06c83a6c8703cf06"

RPROVIDES:${PN} += "octave-forge-geometry \
octave-forge-geometry(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave-cli \
octave-forge-matgeom"

inherit rpm
