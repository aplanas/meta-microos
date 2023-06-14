SUMMARY = "MinGW Windows compiler for C++"
DESCRIPTION = "MinGW Windows compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-gcc-c++-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "3dbc2a70fe446667ac5cc81efb8c5cd1cda38663ea3a1f4c818cf505f015acf3a1cb362a513ff97fb3ef7c6f8988d7cf1e56ed4a59b9441fafee9305c8565041"

RPROVIDES:${PN} += "mingw32-gcc-c++ \
mingw32-lib-stdc++ \
mingw32-lib-stdc++fs \
mingw32-lib-supc++"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libstdc++-gdb-printer \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll"

inherit rpm
