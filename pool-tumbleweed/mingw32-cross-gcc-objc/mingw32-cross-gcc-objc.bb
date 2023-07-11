SUMMARY = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-gcc-objc-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "ee5ce1c3d3bc780cd21c58f136dc11fe2c68051e344ee1f42d6740d5d0390c0faee2f778f5a5aa4030be39d3412d97ed053c30c45029483be18585376c8a9b23"

RPROVIDES:${PN} += "mingw32-cross-gcc-objc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
