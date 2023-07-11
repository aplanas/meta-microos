SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "clang16-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "c6a6f1327627e8ca964c2d3c73b99218f4f4881c171e50a2bd9287f8ec953be334a0e304bb448c554c670b0b77b7e4bc4f7d45d05be5db6e1bbac2b94132472e"

RPROVIDES:${PN} += "clang16 \
libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-standalone-aarch64.so \
libclang-rt.tsan-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
