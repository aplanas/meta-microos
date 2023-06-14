SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-gold-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "6bc31ce42b9918c60231a1d97cd5779e1be87bb643d8d342b1a4c4685d37fbf9d803d668b35657c158ea707584e9c6d9f2f4197ece199184228daac66b798907"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm15-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
