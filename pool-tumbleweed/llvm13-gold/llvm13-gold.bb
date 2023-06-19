SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-gold-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "e392b5c0e85714d48eb75a90b056cf1799332e9be02eace897150c05dd6f23e9c4477591fe0f27e38de170393415e4184f8791d2d588dca795dc6c7a9773ddeb"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm13-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.13 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
