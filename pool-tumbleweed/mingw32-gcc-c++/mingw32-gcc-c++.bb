SUMMARY = "MinGW Windows compiler for C++"
DESCRIPTION = "MinGW Windows compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-gcc-c++-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "268458d5f6d2bd4aee5c6321f4dee401c7dde086f40ea25420309757b7b8b6291acf1f7f405106f6620b4d32af9268622ca2f28ccea6c75e8d4d5681d09c495b"

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
