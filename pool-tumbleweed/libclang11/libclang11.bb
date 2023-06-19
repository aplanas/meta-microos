SUMMARY = "Library files needed for clang"
DESCRIPTION = "This package contains the shared libraries needed for clang."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "libclang11-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "02772b45f78b0fb6a2c6d67a82d1d556a861bf3019e4fcb1e020bf2f27ddf87f1329df791fefa1059da7f944a311368d04148c07b5a8ea268a2f43096cfbff6d"

RPROVIDES:${PN} += "libclang-cpp.so.11 \
libclang.so.11 \
libclang11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.11 \
libLLVM11 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
