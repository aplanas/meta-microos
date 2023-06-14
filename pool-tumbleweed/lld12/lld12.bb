SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "lld12-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "d2f0d738dcf4ae4dc851bf8627132ef19f5d80ff9aec01dbfa22b64ea635a2807b14f4b95fe38843e4e865ba0c72f408fcf74e503bdfcfab6df5acefd5eaeeae"

RPROVIDES:${PN} += "lld12"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.12 \
libc.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
