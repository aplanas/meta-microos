SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "libLLVM16-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "54b716e8020089b0c7a1a6dc2c727e4fb1c2005fccb0884214a174c0e30e63e5cd3f3a9879f39b66de1fdc4b24d0e56571099d059d2860b25c45aa747d65f7cb"

RPROVIDES:${PN} += "libLLVM.so.16 \
libLLVM16 \
libLLVMTableGen.so.16 \
libRemarks.so.16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
