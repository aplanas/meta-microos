SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "lld14-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "6eeaf6ce74eabe6b11b7473a6d897367e0933dddeaaddd6b8285d4c99e70f2eff77e05786ee74c23accd695f8feba98274287eacacc4970d87548d8da15423e6"

RPROVIDES:${PN} += "lld14 \
lld14(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.14()(64bit) \
libLLVM.so.14(LLVM_14)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
