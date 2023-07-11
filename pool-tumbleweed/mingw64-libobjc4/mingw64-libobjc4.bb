SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libobjc4-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "18d0c9b1f9b1c4a3dadc7e4082c525ea20cb658ef3aa9193c3d621b68e91aea129ccad365548b7818eda30232fbb985750fd64880bbfed4b71c51094d37be4e9"

RPROVIDES:${PN} += "mingw64-libobjc \
mingw64-libobjc-4.dll \
mingw64-libobjc4"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libwinpthread-1.dll"

inherit rpm
