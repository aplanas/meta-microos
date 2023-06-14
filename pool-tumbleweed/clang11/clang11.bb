SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "clang11-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "3bd1cfea4f41d3f9eec0a9e9ff4976f2e64f7f9677f64ff640d2f986c815a13a06528984e54d80e97a45579a85f66d3cddc6016e8c0f0853d4c86c071728e25e"

RPROVIDES:${PN} += "clang11 \
libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-aarch64.so \
libclang-rt.scudo-minimal-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libLLVM.so.11 \
libLTO11 \
libc.so.6 \
libclang-cpp.so.11 \
libclang.so.11 \
libclang11 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
