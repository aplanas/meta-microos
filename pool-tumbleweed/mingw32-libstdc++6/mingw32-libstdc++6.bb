SUMMARY = "MinGW Windows compiler for C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libstdc++6-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "15cf64dc42b221922b191199481828a164f11b2f337382c0ab4c1d8ba8023bd696f57109513578cd37520dee2425a7fe73176b43887da542ce72dd341311f35e"

RPROVIDES:${PN} += "mingw32-libstdc++ \
mingw32-libstdc++-6.dll \
mingw32-libstdc++6"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libwinpthread-1.dll"

inherit rpm
