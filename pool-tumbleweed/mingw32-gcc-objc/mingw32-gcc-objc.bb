SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-gcc-objc-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "e6ba3cb960e9d3472bdbc9b53859f28b58efb395ed288641a66cc13c917453ecfe3b7aa5535e07fa27f33b5985657f191226bf14795fb396ad467e1a9243c6c0"

RPROVIDES:${PN} += "mingw32-gcc-objc \
mingw32-lib-objc"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll"

inherit rpm
