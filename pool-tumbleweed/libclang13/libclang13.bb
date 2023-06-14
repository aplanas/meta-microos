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

RPROVIDES:${PN} += "libclang.so.13 \
libclang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libstdc++.so.6"

inherit rpm
