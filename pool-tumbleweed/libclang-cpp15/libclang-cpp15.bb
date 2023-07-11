SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "libclang-cpp15-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "f99f6cb70317d818d106c4bea2d912da9b7e4deb8f5aa382a0c295f46528a00ea43dd8dfdd8b760fe99c3f0fbcf6a6ce4e3b1269ea4de13f969b7901bd141f87"

RPROVIDES:${PN} += "libclang-cpp.so.15 \
libclang-cpp15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
