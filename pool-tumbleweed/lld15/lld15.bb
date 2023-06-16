SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "lld15-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "4a356dd435a9863e0fc50ae9e6cf68e1e61535d2cade7c2e99abacffa538c7ecc9c124eb1af5788b260037a5a7b1251dc4eba2d835e25b9159018934fad641de"

RPROVIDES:${PN} += "lld15"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
