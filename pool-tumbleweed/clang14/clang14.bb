SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "clang14-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "8cd02c656908dd27e39d2dcfbd355290807941ccb059cbc427a10de68b8abad9346451de81a55a13313c3b3e68221670bd85b70d074e648cc03cad3bec0f3688"

RPROVIDES:${PN} += "clang14 \
libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-aarch64.so \
libclang-rt.scudo-minimal-aarch64.so \
libclang-rt.scudo-standalone-aarch64.so \
libclang-rt.tsan-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libclang-cpp.so.14 \
libclang.so.13 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
