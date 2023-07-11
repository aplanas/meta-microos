SUMMARY = "MinGW Windows compiler (GCC) for C"
DESCRIPTION = "MinGW Windows compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-gcc-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "02e95edb7ec760213972dbc38e66fd881499faa17c4610c563a365604068af9c05779c0c96ab16682d74d328bd20dd8af28103e3ad73314bfeabaada5d5b73b0"

RPROVIDES:${PN} += "mingw64-gcc \
mingw64-lib-atomic \
mingw64-lib-caf-single \
mingw64-lib-gcc \
mingw64-lib-gcc-eh \
mingw64-lib-gcc-s \
mingw64-lib-gcov \
mingw64-lib-gomp \
mingw64-lib-ssp \
mingw64-lib-ssp-nonshared \
mingw64-liblto-plugin.dll"

RDEPENDS:${PN} += "/usr/bin/sh \
mingw64-binutils \
mingw64-cpp \
mingw64-headers \
mingw64-libgmp-10.dll \
mingw64-libmpc-3.dll \
mingw64-libmpfr-4.dll \
mingw64-libwinpthread-1.dll \
mingw64-libz.dll \
mingw64-runtime \
mingw64-winpthreads-devel"

inherit rpm
