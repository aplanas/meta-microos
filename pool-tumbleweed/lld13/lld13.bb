SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "lld13-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "e08ac7a13080d3c2002970000508269c3165305505fdc09467d87507221def9d069920a6b240ba54dafc6224911858d6b749c0aa0172f5ee12863bff282840e8"

RPROVIDES:${PN} += "lld13"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.13 \
libc.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
