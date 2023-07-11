SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-cpp-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "f2d0e4b6126f4d7a50f95d359b20a3ca32d8b9aa4e2dddf167403feb51b063ea362e6a9ba4ab4a15566ba701d5241069f0eb076f439fe1348c2fa7a1ee66a4ae"

RPROVIDES:${PN} += "mingw64-cross-cpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
