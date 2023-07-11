SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-gold-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "af790e072a1353e8af029373e64638393fc04e2f912dfc1535664bd3acd571607eb8f42148e87ef6199fdf59d19fcf58178dd4be91d73caec1c26c977becf7ed"

RPROVIDES:${PN} += "llvm-gold-provider \
llvm13-gold"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.13 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
