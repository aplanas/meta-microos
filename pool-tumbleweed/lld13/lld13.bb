SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "lld13-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "f16784f8a34a1a304b4504e930934bcc443b8bdb40b11be28d7032d5b1b0625c4b03c04f2e5d1c5093d619717f02780142bf84c668db116ca7a5688b5f386ddd"

RPROVIDES:${PN} += "lld13"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.13 \
libc.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
