SUMMARY = "MinGW Windows compiler for Fortran"
DESCRIPTION = "MinGW Windows compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-gcc-fortran-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "bca7139e42a93392b84f4750f38fcad287647711148a30e6a9744b274af5821c9364be787d985e2c6dbddffdbdfb50495c8b65fd6b6bcbeafa11a0b5e44b2d42"

RPROVIDES:${PN} += "mingw64-gcc-fortran \
mingw64-lib-gfortran \
mingw64-lib-quadmath"

RDEPENDS:${PN} += "mingw64-libgmp-10.dll \
mingw64-libmpc-3.dll \
mingw64-libmpfr-4.dll \
mingw64-libwinpthread-1.dll \
mingw64-libz.dll"

inherit rpm
