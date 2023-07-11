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

RPM_NAME = "librk0-1.7-2.8.aarch64.rpm"
RPM_HASH = "28fbf6ebf6b8826758666d535e76d6966ebba594b5fc621b8423b2936499a4a16e394a2668bfa5899a80165273a0f0a137859f17091f1b7c1b54f63e660f6aa1"

RPROVIDES:${PN} += "librk.so.0 \
librk0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
