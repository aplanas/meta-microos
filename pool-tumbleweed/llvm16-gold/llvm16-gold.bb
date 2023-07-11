SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "llvm16-gold-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "84e30015d38347a87039acb660bf30efe0aa724e6afdcc7b4af2442132b88833def31d60f701ba56f3bca31a261971724ae1b0ef7a7e9e098c4170880f746967"

RPROVIDES:${PN} += "lib64/LLVMgold.so \
llvm-gold-provider \
llvm16-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
