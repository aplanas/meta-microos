SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libclang13-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "356456b0e2f62d9d76b31c8fe2cd6eb9ea238af1a1b3f9632855dce0e4e741a4201dd0136a922c74764858fb0ba5fece9efef37e201a834bc7371c9fbdcb3234"

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
