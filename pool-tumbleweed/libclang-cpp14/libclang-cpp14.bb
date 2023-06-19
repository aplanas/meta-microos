SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "libclang-cpp14-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "ca61cbb657d456e082710b7bfe26b27c8f15ade446dda77fd839bdc75ea29ce003c8503d3e5cec46efa925303c6e8e4c774b0beda5faf407fd425923b4548708"

RPROVIDES:${PN} += "libclang-cpp.so.14 \
libclang-cpp14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
