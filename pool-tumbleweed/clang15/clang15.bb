SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "clang15-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "aa05559fa7129c112b8400cd3ecac287875eb29d0bb364c0a5393e3286e214f9cd002e11a656642d89a11c156aa95be67473645f1d17bf4513a0fef420cbd972"

RPROVIDES:${PN} += "clang15 \
libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-aarch64.so \
libclang-rt.scudo-minimal-aarch64.so \
libclang-rt.scudo-standalone-aarch64.so \
libclang-rt.tsan-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libclang-cpp.so.15 \
libclang.so.13 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
