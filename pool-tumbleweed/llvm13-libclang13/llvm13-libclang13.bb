SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libclang13-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "9e1de04475f6fc8c056ece05bb41b7b5ba5e83c0f8da2f5d19766ad97ee5753a2d584439a685cca5e8076455fa7709dc76a777f810408e585d54c6791c10802a"

RPROVIDES:${PN} += "libclang.so.13 \
libclang13 \
llvm13-libclang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.13 \
libc.so.6 \
libclang-cpp.so.13 \
libstdc++.so.6"

inherit rpm
