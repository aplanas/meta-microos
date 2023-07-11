SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-libclang13-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "75d70dc4c3699c9853e8c74a5560b6f5c593d9d589256b863d734f5645477bb157e2f1df3eb8d414ee48167a40754acc76ce9828384f0cf0a85edc0df1a77c91"

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
