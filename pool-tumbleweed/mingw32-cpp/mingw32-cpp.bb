SUMMARY = "MinGW Windows C Preprocessor"
DESCRIPTION = "MinGW Windows C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cpp-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "8055e1f47277ac95e67cd28adadd9cb71748a600eb94b630f9782bdd905ecaa7278455ed0185d7c3288f40cc2f7d1379eb0513073b5a262b99bff033ff2bf4de"

RPROVIDES:${PN} += "mingw32-cpp \
mingw32-cpp(aarch-64)"
RDEPENDS:${PN} += "mingw32(libgmp-10.dll) \
mingw32(libmpc-3.dll) \
mingw32(libmpfr-4.dll) \
mingw32(libwinpthread-1.dll) \
mingw32(libz.dll)"

inherit rpm
