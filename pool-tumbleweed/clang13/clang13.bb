SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "clang13-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "2e0e61f09cbb4df7b57702c11915b66f77fbb4389e58f3e67e5c40dcceff7bdc2642cb84c0af1f2ecdc4a619071b720d356dac92114e5ef5aa380acd900f6187"

RPROVIDES:${PN} += "clang13 \
libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-aarch64.so \
libclang-rt.scudo-minimal-aarch64.so \
libclang-rt.scudo-standalone-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
