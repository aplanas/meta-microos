SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "clang13-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "c824e45f6fb69fe77dcea5470544248067bc7e32d4726f7d8b173779188e4feb59dba216f721c2ad277d33b40df9da7a1936d9ad6b797df1b4201dca2b697806"

RPROVIDES:${PN} += "clang13 \
clang13(aarch-64) \
libclang_rt.asan-aarch64.so()(64bit) \
libclang_rt.hwasan-aarch64.so()(64bit) \
libclang_rt.scudo-aarch64.so()(64bit) \
libclang_rt.scudo_minimal-aarch64.so()(64bit) \
libclang_rt.scudo_standalone-aarch64.so()(64bit) \
libclang_rt.ubsan_minimal-aarch64.so()(64bit) \
libclang_rt.ubsan_standalone-aarch64.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.13()(64bit) \
libLLVM.so.13(LLVM_13)(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.13()(64bit) \
libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
update-alternatives"

inherit rpm
