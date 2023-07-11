SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libobjc4-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "134ed0bdd87b3c42c1b100afdb9cc5b089f98c712b9586694c63ccd66951d77be178fde2ad19a7850aa970599eb43112989865520790754c3f37c5f8612f2cda"

RPROVIDES:${PN} += "mingw32-libobjc \
mingw32-libobjc-4.dll \
mingw32-libobjc4"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libwinpthread-1.dll"

inherit rpm
