SUMMARY = "Development files for arpack-ng"
DESCRIPTION = "The arpack-ng-devel package contains libraries and header files for \
developing applications that use arpack-ng."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "arpack-ng-devel-3.9.0-1.5.aarch64.rpm"
RPM_HASH = "5a378a9127f14093224b152d619ef9148764c94bd234562746418b8e3f68e7d0625e9f07e8dc722400dab64431e95b3925d0abee5461de895a41cfe1a08577b6"

RPROVIDES:${PN} += "arpack-devel \
arpack-ng-devel \
cmake-arpackng \
pkgconfig-arpack \
pkgconfig-arpackSolver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
blas-devel \
gcc-fortran \
lapack-devel \
libarpack2 \
pkgconfig-arpack \
pkgconfig-eigen3"

inherit rpm
