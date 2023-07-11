SUMMARY = "A Fast C/C++ Compiler Cache"
DESCRIPTION = "ccache is a compiler cache. It speeds up recompilation by caching the \
result of previous compilations and detecting when the same compilation is \
being done again. Supported languages are C, C++, Objective-C and \
Objective-C++."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.2"

RPM_NAME = "ccache-4.8.2-1.1.aarch64.rpm"
RPM_HASH = "d72ce276ccf0dd9b74e2faf72a24e6c9e5377be305178e92838629e7e6482e523dfd77cb26c315ab56d8ac176ab333e087b82acdea813beb84e9f557680f3650"

RPROVIDES:${PN} += "ccache \
distcc-/usr/bin/ccache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
