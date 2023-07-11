SUMMARY = "MinGW Windows C Preprocessor"
DESCRIPTION = "MinGW Windows C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cpp-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "6992a24f672e8ffe70b3e088bef7804093ed91534cba6f41f57cf2ea65f987e508df5f25024f98910181d8fe09e8870df54e0f7dc40a7fc221989d9a5a24e390"

RPROVIDES:${PN} += "mingw32-cpp"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll"

inherit rpm
