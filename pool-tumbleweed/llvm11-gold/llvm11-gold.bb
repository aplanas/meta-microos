SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-gold-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "c739c66be5a64a3ab74107d412f5d675d704455d98576104c930ac9040c15dc831b2be88e92c26ad139f332c3a638df9d53851870c8c5f448fa675acbdcc50e0"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm11-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.11 \
libLLVM11 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
