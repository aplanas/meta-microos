SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "lld11-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "4e2ee1dc84af9dc4f57a5379fe89d436b01ac5d64ddb0b36967ff31bd71f5975874725171f9523f32a8fd1599a8e827b733925ba1ab0b2b32037e9697ec530ae"

RPROVIDES:${PN} += "lld11"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.11 \
libc.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
