SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libclang13-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "00a93b0693eace64455bd206f3e4af06f7225acd833f713d4f19d0bd7d24b4e30acaf610553038694a062c3592d4920602ff5eb046181cf880eaa1fe38bf2151"

RPROVIDES:${PN} += "libclang.so.13 \
libclang13 \
llvm14-libclang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libclang-cpp.so.14 \
libstdc++.so.6"

inherit rpm
