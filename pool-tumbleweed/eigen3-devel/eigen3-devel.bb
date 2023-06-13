SUMMARY = "C++ Template Library for Linear Algebra"
DESCRIPTION = "Eigen is a C++ template library for linear algebra: matrices, vectors, \
numerical solvers, and related algorithms."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & MPL-2.0 & LGPL-2.1-or-later"

PV = "3.4.0"

RPM_NAME = "eigen3-devel-3.4.0-2.6.noarch.rpm"
RPM_HASH = "50fda0b649de4bffc92fb5a68c6674923aa4059610bcaff78c5e392a6e4811ccface3fde0b099422fa02f689dcfee6e4044a8d94b2eeb563c00e0e2795d7314e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eigen3-devel \
libeigen3-devel \
pkgconfig(eigen3)"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
