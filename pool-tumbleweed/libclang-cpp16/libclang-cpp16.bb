SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "libclang-cpp16-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "8fcaea77c2588c73de1d8efd320b46d0c2015a485dd7c9f85a96af39749fb12b30aaa827e51c81a23dcb53b58b6777bc3c2f06c9f4af97846b90bfe79c637e24"

RPROVIDES:${PN} += "libclang-cpp.so.16 \
libclang-cpp16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
