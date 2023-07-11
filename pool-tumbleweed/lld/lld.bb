SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for \
system linkers and runs much faster than them. It also provides features that \
are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "lld-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "b9c95b120e9b92d4f7ed6069c8ce3fcd1d61f72f094bbcd688ef3f66ced210954d6731a3e6bf0f78e90c0049c6722b79f9c5cd7b9998eb3de92054dfab906dcf"

RPROVIDES:${PN} += "lld"

RDEPENDS:${PN} += "lld16"

inherit rpm
