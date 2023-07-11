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

RPM_NAME = "rk-devel-1.7-2.8.aarch64.rpm"
RPM_HASH = "fa0e739d0272cb03fd93206b15c7fad9e4fb06294611c5ca4b6ad5b6da0bfd7023bba8bd1bf7f605a33afcbc24fbc367d58af372b7457a062812d4dec58b629e"

RPROVIDES:${PN} += "pkgconfig-rk \
rk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librk0"

inherit rpm
