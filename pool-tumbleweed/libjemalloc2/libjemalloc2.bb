SUMMARY = "General-purpose scalable concurrent malloc implementation"
DESCRIPTION = "General-purpose scalable concurrent malloc(3) implementation. \
This distribution is the stand-alone 'portable' version of jemalloc."
LICENSE = "BSD-2-Clause"

PV = "5.3.0"

RPM_NAME = "libjemalloc2-5.3.0-1.7.aarch64.rpm"
RPM_HASH = "dffbff2e55f7809bf46237bcf51abf32982098ef494a398062b07ac335aaec77807f10be9897600bb121a089bd6b1d3022d159291ca46910a917bf976afa908e"

RPROVIDES:${PN} += "libjemalloc.so.2 \
libjemalloc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
