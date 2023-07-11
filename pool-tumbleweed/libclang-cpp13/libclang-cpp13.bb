SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "libclang-cpp13-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "23868eecae85feb3cb0ba19be58e3c73255d138462ffd7e3029bc451b50a8ee5b5e88afcc80d2e2495c7d3240613f981f40794621d54a762cfcfe106f5edfcaa"

RPROVIDES:${PN} += "libclang-cpp.so.13 \
libclang-cpp13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.13 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
