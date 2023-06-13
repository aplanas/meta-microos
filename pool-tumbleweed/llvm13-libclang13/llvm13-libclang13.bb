SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libclang13-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "1c1fd9a4940c450af054bf24c280577042710451f5ebbb42e247f6409429f99cc4c41b4108e89bcd75ea2880b3a7446b05edb26d6c679a142a7d1b46da57a194"

RPROVIDES:${PN} += "libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libclang13 \
llvm13-libclang13 \
llvm13-libclang13(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.13()(64bit) \
libLLVM.so.13(LLVM_13)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclang-cpp.so.13()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
