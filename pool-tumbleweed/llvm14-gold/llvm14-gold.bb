SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-gold-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "bfe3012b9a7e77b048f4b75eaa2117cdf2f8c73862eacdeb12522617ff1e9a82e8f1b2bcbab22dab709f2881ec90d85a9564d5688e92796802f046b5bc412199"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm14-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
