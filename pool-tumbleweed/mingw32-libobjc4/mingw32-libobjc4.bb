SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libobjc4-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "c28010cb5cbf9f483bdf5436dea3e27da74b6df32fc33ffc5ed52d9c9a1b70d63d4d79370fd51c409d80923b2f94f68202f16132b5902dd52454e6c82c9c204d"

RPROVIDES:${PN} += "mingw32-libobjc \
mingw32-libobjc-4.dll \
mingw32-libobjc4"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libwinpthread-1.dll"

inherit rpm
