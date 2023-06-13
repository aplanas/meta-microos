SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "clang15-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "aa05559fa7129c112b8400cd3ecac287875eb29d0bb364c0a5393e3286e214f9cd002e11a656642d89a11c156aa95be67473645f1d17bf4513a0fef420cbd972"

RPROVIDES:${PN} += "clang15 \
clang15(aarch-64) \
libclang_rt.asan-aarch64.so()(64bit) \
libclang_rt.hwasan-aarch64.so()(64bit) \
libclang_rt.scudo-aarch64.so()(64bit) \
libclang_rt.scudo_minimal-aarch64.so()(64bit) \
libclang_rt.scudo_standalone-aarch64.so()(64bit) \
libclang_rt.tsan-aarch64.so()(64bit) \
libclang_rt.ubsan_minimal-aarch64.so()(64bit) \
libclang_rt.ubsan_standalone-aarch64.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.15()(64bit) \
libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
update-alternatives"

inherit rpm
