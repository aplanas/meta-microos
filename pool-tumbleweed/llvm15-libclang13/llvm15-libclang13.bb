SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-libclang13-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "cc1608ed44d988bf6caff36d9552d29338752bacadc4cc5ae65235268aceb9abc703406a42a810ffad727c19c040f49f7a7043ff95a97cddd61fabb4c5690888"

RPROVIDES:${PN} += "libclang.so.13 \
libclang13 \
llvm15-libclang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libclang-cpp.so.15 \
libstdc++.so.6"

inherit rpm
