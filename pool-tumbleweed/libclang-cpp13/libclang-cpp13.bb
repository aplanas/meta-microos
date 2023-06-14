SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "libclang-cpp13-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "587a5c23b2c857012ac82139992ef160cd68a15e9ad7cda0f7d3823043d78aea880f6d4e3349a17d17145d8359bcfe5228cb0fd03cd70f44c07311d908633a5e"

RPROVIDES:${PN} += "libclang-cpp.so.13 \
libclang-cpp13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.13 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
