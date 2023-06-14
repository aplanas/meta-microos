SUMMARY = "MinGW Windows compiler for C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libstdc++6-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "d9b0417612fe305d8e110fcd5bd501104b0229abeb17f7b5fe3f27b6ccd91e99d79f518882e103bf5f9fcbc9097dfb1c7c605824631efce1f3afd7e62194b453"

RPROVIDES:${PN} += "mingw64-libstdc++ \
mingw64-libstdc++-6.dll \
mingw64-libstdc++6"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libwinpthread-1.dll"

inherit rpm
