SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-gold-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "0c2c770de444ddda85530e202ce1aad96aa8c2d597be6e3c178d5cf10d7f42129f65e168b13d68b3aa8156a8389ebcd52567a69504ac595dbe9784f9f60761e7"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm12-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.12 \
libLLVM12 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
