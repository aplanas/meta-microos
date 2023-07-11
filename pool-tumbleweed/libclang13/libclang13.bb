SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "libclang13-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "d99425123f9391787921cd4d9503c2f4fa81c5e8294b1cc9603c4d6ac619a129eee2ea19da7e79b2948a7018e9404364785c20f5eda9ef1fb39f7001d5bc5177"

RPROVIDES:${PN} += "libclang.so.13 \
libclang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libstdc++.so.6"

inherit rpm
