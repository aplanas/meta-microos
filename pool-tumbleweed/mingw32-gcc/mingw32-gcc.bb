SUMMARY = "MinGW Windows compiler (GCC) for C"
DESCRIPTION = "MinGW Windows compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-gcc-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "20431c0e48ec57f85f16cb6d3e28e9f6a2ea22fee482310119056bdea589b4b8aa0c227d1481581df017a79654f36f07e9489a9c5df8a98aac4a723bc085aaaf"

RPROVIDES:${PN} += "mingw32-gcc \
mingw32-lib-atomic \
mingw32-lib-caf-single \
mingw32-lib-gcc \
mingw32-lib-gcc-eh \
mingw32-lib-gcc-s \
mingw32-lib-gcov \
mingw32-lib-gomp \
mingw32-lib-ssp \
mingw32-lib-ssp-nonshared \
mingw32-liblto-plugin.dll"

RDEPENDS:${PN} += "/usr/bin/sh \
mingw32-binutils \
mingw32-cpp \
mingw32-headers \
mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll \
mingw32-runtime \
mingw32-winpthreads-devel"

inherit rpm
