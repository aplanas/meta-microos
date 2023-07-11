SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "lld16-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "51f3258d379c258900b6d4fb37240f50a150795d08595aac561d90beea38da2978107aea2def52fcc927cb5fb88d41786e2d8849578281f2f30d1d41ec7c656d"

RPROVIDES:${PN} += "lld16"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
