SUMMARY = "MinGW Windows compiler for Fortran"
DESCRIPTION = "MinGW Windows compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-gcc-fortran-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "5c2e41dc9f198bd1156c164e7d7a8f19a92c01f1455416796b1e82fe147b1e015d83bf506b0d806d50ddc43ff800aba8d5225e9caaced05493b04dfe5a89c066"

RPROVIDES:${PN} += "mingw64(lib:gfortran) \
mingw64(lib:quadmath) \
mingw64-gcc-fortran \
mingw64-gcc-fortran(aarch-64)"

RDEPENDS:${PN} += "mingw64(libgmp-10.dll) \
mingw64(libmpc-3.dll) \
mingw64(libmpfr-4.dll) \
mingw64(libwinpthread-1.dll) \
mingw64(libz.dll)"

inherit rpm
