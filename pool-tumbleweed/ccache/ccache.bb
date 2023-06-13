SUMMARY = "A Fast C/C++ Compiler Cache"
DESCRIPTION = "ccache is a compiler cache. It speeds up recompilation by caching the \
result of previous compilations and detecting when the same compilation is \
being done again. Supported languages are C, C++, Objective-C and \
Objective-C++."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.1"

RPM_NAME = "ccache-4.8.1-1.1.aarch64.rpm"
RPM_HASH = "a67cfd19946a928a153517bf420b3d5cdec30c3ab13f0048bee798449ff085d3592c3228932e19ecb2c7d872a0e3a4081a372995a335a6f68488f9ea8c298ecf"

RPROVIDES:${PN} += "ccache \
ccache(aarch-64) \
distcc:/usr/bin/ccache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
