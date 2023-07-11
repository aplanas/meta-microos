SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "lld15-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "417a5dad7dfb52070eceb329c0aa09f7d1e530beef4e75fd16c0b6a457072e82dad60703cc096223ea1bf2a12c1dfb658997ca8c57e048f658c089e393a23edb"

RPROVIDES:${PN} += "lld15"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
