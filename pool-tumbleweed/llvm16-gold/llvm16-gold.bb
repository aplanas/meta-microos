SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "llvm16-gold-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "6579ac53ea2dbfcf0eab70271b53212a7d59009b075cfaefd747b4168d989cc07e13de6b33dc1faab6a2e239f82f57841bf991cd85bc5ecb7c1a9ed225930025"

RPROVIDES:${PN} += "lib64/LLVMgold.so \
llvm-gold-provider \
llvm16-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
