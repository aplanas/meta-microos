SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "lld14-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "88af312d2d5de3d17aa13241c795c8f74049669a48c716124beb86e48ae6b3815b9fe1c83762fca9438f61e989cbf5953634c349f173f5e9a4cd2e0b1e6ac07d"

RPROVIDES:${PN} += "lld14"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
