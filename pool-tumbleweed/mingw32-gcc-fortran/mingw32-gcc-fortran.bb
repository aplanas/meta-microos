SUMMARY = "MinGW Windows compiler for Fortran"
DESCRIPTION = "MinGW Windows compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-gcc-fortran-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "32b2ca4f0c492f5efeb063e0afa138b86ee002ac9568b600efda651c0ab43b06862d6158a29089d74ea62236b2bf8b8eae0081525e024cd1fbe4b091f6f526a8"

RPROVIDES:${PN} += "mingw32-gcc-fortran \
mingw32-lib-gfortran \
mingw32-lib-quadmath"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll"

inherit rpm
