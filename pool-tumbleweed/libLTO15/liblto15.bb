SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "libLTO15-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "35c3673ff4be932806c857d8a8814efad020c2f51e2eac61eda4926bd2a4f617a498f285cec16f0a9fb05369b9d99414f52adfdbd83b1ada39576ee66360d86b"

RPROVIDES:${PN} += "libLTO.so.15 \
libLTO15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
