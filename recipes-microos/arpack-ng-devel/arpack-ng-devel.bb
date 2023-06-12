SUMMARY = "Development files for arpack-ng"
DESCRIPTION = "The arpack-ng-devel package contains libraries and header files for \
developing applications that use arpack-ng."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "arpack-ng-devel-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "9217094190199c0215579a004ecff234f3319e1fec00853956ba279a30dd0c122df1ec862a909b3871a9acf6da5fb9895abeb4257b48427d6f966c636ca3cb63"

RPROVIDES:${PN} += "arpack-devel \
arpack-ng-devel \
arpack-ng-devel(aarch-64) \
cmake(arpackng) \
pkgconfig(arpack) \
pkgconfig(arpackSolver)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
blas-devel \
gcc-fortran \
lapack-devel \
libarpack2 \
pkgconfig(arpack) \
pkgconfig(eigen3)"

inherit rpm
