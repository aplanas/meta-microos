SUMMARY = "Runtime C++ ANTRL libraries"
DESCRIPTION = "ANTLR runtime libraries for C++. \
ANTLR (ANother Tool for Language Recognition) is a parser generator \
for reading, processing, executing, or translating structured text or \
binary files."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libantlr4-runtime4_13_0-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "6f68ef760a745beb57c3d35ea02e723e4b04668a94d08e8efa67539530abe7ae8f8213c6b2fda02c99f0bed2bccd042c93efd7bb34a3d4987a5d3030252f50c1"

RPROVIDES:${PN} += "libantlr4-runtime.so.4.13.0 \
libantlr4-runtime4-13-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
