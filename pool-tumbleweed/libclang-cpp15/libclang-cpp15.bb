SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "libclang-cpp15-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "c216861d1e05a26bd064d6d32a4f266c5d8ccd462def3c2df152313289935c1b8948be8c0c496355950e0dd3bff1447872f9cce9119566631a4be4d866d41a53"

RPROVIDES:${PN} += "libclang-cpp.so.15()(64bit) \
libclang-cpp15 \
libclang-cpp15(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
