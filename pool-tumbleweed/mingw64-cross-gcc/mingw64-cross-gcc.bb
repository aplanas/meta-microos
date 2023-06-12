SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-gcc-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "fa2eb20627bcaa7688ac3f5c63e62fe5fd348aed88d467e368d0b805ccd041aa267f7e29124f851c31566953d998c0028655f7a58e092460c76b129a2b7c8532"

RPROVIDES:${PN} += "liblto_plugin.so()(64bit) \
mingw64-cross-gcc \
mingw64-cross-gcc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
mingw64-cross-binutils \
mingw64-cross-cpp \
mingw64-filesystem \
mingw64-headers \
mingw64-runtime"

inherit rpm