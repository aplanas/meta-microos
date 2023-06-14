SUMMARY = "MinGW Windows compiler for C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libstdc++6-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "941eade3ff6c20bcac0590ef85d2ce5dce6517ed95745ea9f2a223a610148257fd040fd71f2f085e8a0574c2c6477fb68a9bae71c624842a00630c0c2cac6a75"

RPROVIDES:${PN} += "mingw32-libstdc++ \
mingw32-libstdc++-6.dll \
mingw32-libstdc++6"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libwinpthread-1.dll"

inherit rpm
