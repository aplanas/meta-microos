SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "clang12-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "d552afa9fa730dd8f67555be39f2f1e290c603b063554625b3849fa6fff990e6c5a66b03be339f8fa62a354c3cc20ca15894a0a3bf76587ed227b53b11d9626b"

RPROVIDES:${PN} += "clang12 \
libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-aarch64.so \
libclang-rt.scudo-minimal-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libLLVM.so.12 \
libLTO12 \
libc.so.6 \
libclang-cpp.so.12 \
libclang.so.12 \
libclang12 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
