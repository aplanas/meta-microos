SUMMARY = "MinGW Windows compiler for Fortran"
DESCRIPTION = "MinGW Windows compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-gcc-fortran-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "f65b1fd81b603a40d23453b1dd30eb8bb9c45249d6e47c0e51b89aa621a68af07c3f682723168f820030a97aaefeb9cf99b31a1d3668e664bd84f5da9e0f8b01"

RPROVIDES:${PN} += "mingw32-gcc-fortran \
mingw32-lib-gfortran \
mingw32-lib-quadmath"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll"

inherit rpm
