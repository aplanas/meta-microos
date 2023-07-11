SUMMARY = "C++ Template Library for Linear Algebra"
DESCRIPTION = "Eigen is a C++ template library for linear algebra: matrices, vectors, \
numerical solvers, and related algorithms."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & MPL-2.0 & LGPL-2.1-or-later"

PV = "3.4.0"

RPM_NAME = "eigen3-devel-3.4.0-2.7.noarch.rpm"
RPM_HASH = "3f8a94067b631069ba2d675b0673dc4c2aa64d7eda5d2098f86e2530839a4e0afcf1289e524b707866b539faa3872f387dec870c78b5711d4386e696bda5045c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eigen3-devel \
libeigen3-devel \
pkgconfig-eigen3"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
