SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-gcc-objc-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "b1e6a074548bb47399082a2c280346f085550e694c239f86d0e1d294d1287cfff7cf6387c7ad244dfad450d4fa9befadfffdff245464e289d332d6c50a698c5a"

RPROVIDES:${PN} += "mingw32-gcc-objc \
mingw32-lib-objc"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll"

inherit rpm
