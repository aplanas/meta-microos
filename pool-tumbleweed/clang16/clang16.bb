SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "clang16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "01c52e1d6dd91bed346d3357b54ab0c76e45a262f1500be76ae9363509b8c177dafcd207d4019cf915261db73a3333b8cadc2d3c952c377c0ba76c4b7de2a66c"

RPROVIDES:${PN} += "clang16 \
clang16(aarch-64) \
libclang_rt.asan-aarch64.so()(64bit) \
libclang_rt.hwasan-aarch64.so()(64bit) \
libclang_rt.scudo_standalone-aarch64.so()(64bit) \
libclang_rt.tsan-aarch64.so()(64bit) \
libclang_rt.ubsan_minimal-aarch64.so()(64bit) \
libclang_rt.ubsan_standalone-aarch64.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libLLVMTableGen.so.16()(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.16()(64bit) \
libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libclang.so.13(LLVM_16)(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
update-alternatives"

inherit rpm
