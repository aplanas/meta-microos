SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "clang14-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "8cd02c656908dd27e39d2dcfbd355290807941ccb059cbc427a10de68b8abad9346451de81a55a13313c3b3e68221670bd85b70d074e648cc03cad3bec0f3688"

RPROVIDES:${PN} += "clang14 \
clang14(aarch-64) \
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
libLLVM.so.14()(64bit) \
libLLVM.so.14(LLVM_14)(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.14()(64bit) \
libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
update-alternatives"

inherit rpm
