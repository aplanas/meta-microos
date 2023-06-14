SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-cpp-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "625847e360ddb45655b50d8065d2b96ead8b6a82b3345f618aa6288b6575d66413c210b28f270eae73dbbc2cdd13fdf02594d83926e1a7202a2cefeaad70bea5"

RPROVIDES:${PN} += "mingw64-cross-cpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
