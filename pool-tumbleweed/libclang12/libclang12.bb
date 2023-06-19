SUMMARY = "Library files needed for clang"
DESCRIPTION = "This package contains the shared libraries needed for clang."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "libclang12-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "dd335dbc99f1864d0959ea57e2eeadbfc9b1fad82e7f2241977d0c577be30eb572d3b188990f4b284bfa6c81d0634b7b0b6e089ba9fad0c463822fa38a31507c"

RPROVIDES:${PN} += "libclang-cpp.so.12 \
libclang.so.12 \
libclang12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.12 \
libLLVM12 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
