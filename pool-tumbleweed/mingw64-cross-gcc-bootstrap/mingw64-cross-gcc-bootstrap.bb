SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-gcc-bootstrap-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "0d020baec4d91e7d2ddf63e417863c50b988074dc6a9a8a04f018c33a289b52837b5d1add465daee745feff33a91675f966948a587740b6428f4ab596caac210"

RPROVIDES:${PN} += "liblto_plugin.so()(64bit) \
mingw64-cross-gcc-bootstrap \
mingw64-cross-gcc-bootstrap(aarch-64)"

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
mingw64-cross-cpp-bootstrap \
mingw64-filesystem \
mingw64-headers \
mingw64-headers-dummy-pthread"

inherit rpm
