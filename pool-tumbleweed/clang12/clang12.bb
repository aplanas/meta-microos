SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "clang12-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "d552afa9fa730dd8f67555be39f2f1e290c603b063554625b3849fa6fff990e6c5a66b03be339f8fa62a354c3cc20ca15894a0a3bf76587ed227b53b11d9626b"

RPROVIDES:${PN} += "clang12 \
clang12(aarch-64) \
libclang_rt.asan-aarch64.so()(64bit) \
libclang_rt.hwasan-aarch64.so()(64bit) \
libclang_rt.scudo-aarch64.so()(64bit) \
libclang_rt.scudo_minimal-aarch64.so()(64bit) \
libclang_rt.ubsan_minimal-aarch64.so()(64bit) \
libclang_rt.ubsan_standalone-aarch64.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.12()(64bit) \
libLLVM.so.12(LLVM_12)(64bit) \
libLTO12 \
libc.so.6()(64bit) \
libclang-cpp.so.12()(64bit) \
libclang.so.12()(64bit) \
libclang.so.12(LLVM_12)(64bit) \
libclang12 \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
update-alternatives"

inherit rpm
