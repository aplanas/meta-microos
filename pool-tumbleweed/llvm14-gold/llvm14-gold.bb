SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-gold-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "9c5f96e87f3187f2d2a316016a3a41a5b7837f7d608ca8cec5b849971679fbc1cb946fe172c3b6758294aa6901dffb16ecc37bba73cad7a823d59b55c11ac109"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm14-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
