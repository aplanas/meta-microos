SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "clang16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "01c52e1d6dd91bed346d3357b54ab0c76e45a262f1500be76ae9363509b8c177dafcd207d4019cf915261db73a3333b8cadc2d3c952c377c0ba76c4b7de2a66c"

RPROVIDES:${PN} += "clang16 \
libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-standalone-aarch64.so \
libclang-rt.tsan-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libLLVMTableGen.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libclang.so.13 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.2 \
update-alternatives"

inherit rpm
