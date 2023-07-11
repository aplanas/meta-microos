SUMMARY = "Molecular dynamics package"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains development libraries and header for GROMACS"
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-devel-2023-1.2.aarch64.rpm"
RPM_HASH = "a971df4e7d45eb73b00af1536f23c27f2cc13c1fc61ca5f3894c5436c1c1bf41a652ce553ebd38f3302b65d30452e315e59b3401bae54c4d6ec18f25f8921731"

RPROVIDES:${PN} += "cmake-gmxapi \
cmake-gromacs \
gromacs-devel \
pkgconfig-libgromacs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gromacs \
libgmxapi0 \
libgromacs8 \
libnblib-gmx0 \
pkgconfig-fftw3f"

inherit rpm
