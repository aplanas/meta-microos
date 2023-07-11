SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs"
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "libgromacs8-2023-1.2.aarch64.rpm"
RPM_HASH = "2df5481b93b00b925ab2453fb4a075ff6e7d6997ebe74e4c45f36857def4799b1f60e8d75ce680572b84ab8f827113a521cb85227671619b59e70147d2170469"

RPROVIDES:${PN} += "libgromacs.so.8 \
libgromacs8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
liblapack.so.3 \
libm.so.6 \
libmuparser.so.2.3.4 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
