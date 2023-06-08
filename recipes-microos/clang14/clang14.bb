SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "clang14-14.0.6-8.1.aarch64.rpm"
RPM_HASH = "359d896f65499e29a5912cf86fc698bcf96daca2f5ba1f0443d70c8528c930cb0407dd44d682d5fe38a1792d68e4ed8de224b8778a9cdfe0826ccdb07a6854d8"

RPROVIDES:${PN} += "clang14 clang14(aarch-64) libclang_rt.asan-aarch64.so()(64bit) libclang_rt.hwasan-aarch64.so()(64bit) libclang_rt.scudo-aarch64.so()(64bit) libclang_rt.scudo_minimal-aarch64.so()(64bit) libclang_rt.scudo_standalone-aarch64.so()(64bit) libclang_rt.tsan-aarch64.so()(64bit) libclang_rt.ubsan_minimal-aarch64.so()(64bit) libclang_rt.ubsan_standalone-aarch64.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.14()(64bit) libLLVM.so.14(LLVM_14)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang-cpp.so.14()(64bit) libclang.so.13()(64bit) libclang.so.13(LLVM_13)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) update-alternatives"

inherit rpm
