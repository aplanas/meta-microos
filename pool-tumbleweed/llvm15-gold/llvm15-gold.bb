SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-gold-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "8d9ef780858a14c8f59d5d326ca47661c9a8ce0ec475e501fea83d524d96c57d6ff4dabf9156b90158cc894d2bee35bd8a23783c9a9ddccc95e7149bc163366b"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm15-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
