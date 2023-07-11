SUMMARY = "MinGW Windows compiler for C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libstdc++6-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "61a47f163cd9a5e67e4e5136f82e59c4ddd2dce9a6486f1c808a621b43429202637534f74a135aa113ba64ebe80e0a0f563f695598054cacd757207dbc63893c"

RPROVIDES:${PN} += "mingw64-libstdc++ \
mingw64-libstdc++-6.dll \
mingw64-libstdc++6"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libwinpthread-1.dll"

inherit rpm
