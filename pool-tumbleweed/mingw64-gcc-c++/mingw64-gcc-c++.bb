SUMMARY = "MinGW Windows compiler for C++"
DESCRIPTION = "MinGW Windows compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-gcc-c++-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "fbfe822f0e1afcc0120b4dacc92ea01a66754472aaaff558e8a87e8c185e3a684e053f882f3fdf04bffaa65dbdf54ce020157e1d805f2113a9d1e3e5692ec943"

RPROVIDES:${PN} += "mingw64-gcc-c++ \
mingw64-lib-stdc++ \
mingw64-lib-stdc++fs \
mingw64-lib-supc++"

RDEPENDS:${PN} += "mingw64-libgmp-10.dll \
mingw64-libmpc-3.dll \
mingw64-libmpfr-4.dll \
mingw64-libstdc++-gdb-printer \
mingw64-libwinpthread-1.dll \
mingw64-libz.dll"

inherit rpm
