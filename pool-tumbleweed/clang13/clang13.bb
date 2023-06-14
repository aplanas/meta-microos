SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "clang13-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "c824e45f6fb69fe77dcea5470544248067bc7e32d4726f7d8b173779188e4feb59dba216f721c2ad277d33b40df9da7a1936d9ad6b797df1b4201dca2b697806"

RPROVIDES:${PN} += "clang13 \
libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-aarch64.so \
libclang-rt.scudo-minimal-aarch64.so \
libclang-rt.scudo-standalone-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libLLVM.so.13 \
libc.so.6 \
libclang-cpp.so.13 \
libclang.so.13 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
