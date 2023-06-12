SUMMARY = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-gcc-objc-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "955cbd285ac4dbf81d7f9f983dcb3c8a8d6f97e55883adc69bf97b4b30f893bf72e3bb39550c29faddb62a925b1e548bd72cf32804b53dace288460e7942b23e"

RPROVIDES:${PN} += "mingw32-cross-gcc-objc \
mingw32-cross-gcc-objc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
