SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-cpp-bootstrap-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "35ca3b69bc9a496fcc4adbb372c2cc0a2c146ff71dace318a37254dd3aabcfd2ef4607613349efa605419b88fd841e89158e2194dcb44275b569b48b62942eec"

RPROVIDES:${PN} += "mingw64-cross-cpp-bootstrap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
