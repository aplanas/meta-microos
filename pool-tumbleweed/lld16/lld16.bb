SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "lld16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "546f603c47a0420dfd4ed0a8b9cba9fe2bd3e43de648abe0f610280cc036ef59092d5b347566f6c01804ae95191d8972a75efbe9ec95ae4370e9f96a00275e43"

RPROVIDES:${PN} += "lld16"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
