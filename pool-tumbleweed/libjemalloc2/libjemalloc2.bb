SUMMARY = "General-purpose scalable concurrent malloc implementation"
DESCRIPTION = "General-purpose scalable concurrent malloc(3) implementation. \
This distribution is the stand-alone 'portable' version of jemalloc."
LICENSE = "BSD-2-Clause"

PV = "5.3.0"

RPM_NAME = "libjemalloc2-5.3.0-1.6.aarch64.rpm"
RPM_HASH = "16818654c8c9202429703499de94eaa8d914e5177dc8aa96a0af50ba8fed9e11f7dda8dea294a7033d1a5c7ad87f2c8fa1a7ad16fefcd17e1b29836f6b1086ca"

RPROVIDES:${PN} += "libjemalloc.so.2()(64bit) \
libjemalloc2 \
libjemalloc2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
