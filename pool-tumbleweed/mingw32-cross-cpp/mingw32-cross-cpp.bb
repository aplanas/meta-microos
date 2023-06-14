SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-cpp-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "618c3e7f718bd011317673044908ad97d709369b40467dd72c8a1acd3c8c90f177c89548dc62aa9bdb381cdae43025d8e726b632e85ece5ebe91ea62dcaf686e"

RPROVIDES:${PN} += "mingw32-cross-cpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
