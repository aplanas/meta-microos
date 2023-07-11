SUMMARY = "MinGW Windows compiler for Fortran shared libraries"
DESCRIPTION = "MinGW Windows compiler for Fortran shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libgfortran5-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "faaa68436f375773f1c59f410c747044092702f16495d88e1178bd6469703866f153c238a548579a2b1d0230611cdfad4e7861d87cce3642d8e0f34453cc7682"

RPROVIDES:${PN} += "mingw64-libgfortran \
mingw64-libgfortran-5.dll \
mingw64-libgfortran5"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libquadmath-0.dll \
mingw64-libwinpthread-1.dll"

inherit rpm
