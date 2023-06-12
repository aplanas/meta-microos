SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libclang13-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "30eacf95af4b3252f40a323ec1725a563fe90ab8f31dad2c9b38b71d2c8aa0215350a8ac92246997443dd1662b859cbdfa35ce7f5068cd245fe24f5e54a98f8e"

RPROVIDES:${PN} += "libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libclang.so.13(LLVM_16)(64bit) \
libclang13 \
libclang13(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclang-cpp.so.16()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
