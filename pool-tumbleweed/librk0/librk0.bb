SUMMARY = "A C++ library for relativistic kinematics"
DESCRIPTION = "rk provides a C++ double precision implementation of several \
basic geometric entities and transformations: points in 3d, \
directions in 3d (unit vectors), 3-vectors, points in 4d, \
4-vectors, rotations, linear transformations, and boosts. The main \
purpose of the package is representing 4-momenta of relativistic \
particles and related formulae. \
 \
This package provides the shared libraries required for rk."
LICENSE = "X11"

PV = "1.7"

RPM_NAME = "librk0-1.7-2.7.aarch64.rpm"
RPM_HASH = "8a84072adeddde86c1561fbe2012e77bbb1508ea78f2f347527c16239f52fb69529701fc83a244049cb207ecf3e18e8ef848d65977b4b145026c8cd50b4c25a7"

RPROVIDES:${PN} += "librk.so.0 \
librk0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
