SUMMARY = "A C++ library for relativistic kinematics"
DESCRIPTION = "rk provides a C++ double precision implementation of several \
basic geometric entities and transformations: points in 3d, \
directions in 3d (unit vectors), 3-vectors, points in 4d, \
4-vectors, rotations, linear transformations, and boosts. The main \
purpose of the package is representing 4-momenta of relativistic \
particles and related formulae. \
 \
This package provides the source files required for development \
with rk."
LICENSE = "X11"

PV = "1.7"

RPM_NAME = "rk-devel-1.7-2.7.aarch64.rpm"
RPM_HASH = "e14c09a77f9d6560f62f3334531cc744fadf10b08cdb58b01c9e450e64980dd7d25c720668e1b25cd2c98132487889a1c9ee66621915ac10d04507a660f83016"

RPROVIDES:${PN} += "pkgconfig(rk) \
rk-devel \
rk-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librk0"

inherit rpm
