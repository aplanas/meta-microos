SUMMARY = "Molecular dynamics package"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains development libraries and header for GROMACS"
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-devel-2023-1.1.aarch64.rpm"
RPM_HASH = "7fe07a8562a3262abc836640007bfc458893fa107ff5277ad85ed67fc867e16eafe98b154e590dd83c191f6ea6677aa3faeb3ced7bae256eb646e5bb16e9d623"

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
