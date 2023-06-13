SUMMARY = "Thread abstraction library for OpenEXR"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libIlmThread"
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "libIlmThread-3_1-30-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "d300964b7319db3a387039ec33e86db7210c6cac603db0e0bd3a0b97a7275a5d2892b588902eead79ce95fa0a51f5937ed5b366200942544282e3e0d52e55e38"

RPROVIDES:${PN} += "libIlmThread-3_1-30 \
libIlmThread-3_1-30(aarch-64) \
libIlmThread-3_1.so.30()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libIex-3_1.so.30()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
