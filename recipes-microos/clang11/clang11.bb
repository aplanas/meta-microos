SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "clang11-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "3bd1cfea4f41d3f9eec0a9e9ff4976f2e64f7f9677f64ff640d2f986c815a13a06528984e54d80e97a45579a85f66d3cddc6016e8c0f0853d4c86c071728e25e"

RPROVIDES:${PN} += "clang11 \
clang11(aarch-64) \
libclang_rt.asan-aarch64.so()(64bit) \
libclang_rt.hwasan-aarch64.so()(64bit) \
libclang_rt.scudo-aarch64.so()(64bit) \
libclang_rt.scudo_minimal-aarch64.so()(64bit) \
libclang_rt.ubsan_minimal-aarch64.so()(64bit) \
libclang_rt.ubsan_standalone-aarch64.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.11()(64bit) \
libLLVM.so.11(LLVM_11)(64bit) \
libLTO11 \
libc.so.6(GLIBC_2.34)(64bit) \
libclang-cpp.so.11()(64bit) \
libclang.so.11()(64bit) \
libclang.so.11(LLVM_11)(64bit) \
libclang11 \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
update-alternatives"

inherit rpm
