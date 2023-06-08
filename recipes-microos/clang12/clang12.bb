SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "clang12-12.0.1-11.1.aarch64.rpm"
RPM_HASH = "c559e63b7c81816535815abda967eee1d23a92af404a2be48ead089e51f12e48b3c6d0b9ed1eb132151ad8b9c82838cd6ee210df5589724c45ec65427229bd42"

RPROVIDES:${PN} += "clang12 clang12(aarch-64) libclang_rt.asan-aarch64.so()(64bit) libclang_rt.hwasan-aarch64.so()(64bit) libclang_rt.scudo-aarch64.so()(64bit) libclang_rt.scudo_minimal-aarch64.so()(64bit) libclang_rt.ubsan_minimal-aarch64.so()(64bit) libclang_rt.ubsan_standalone-aarch64.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.12()(64bit) libLLVM.so.12(LLVM_12)(64bit) libLTO12 libc.so.6(GLIBC_2.34)(64bit) libclang-cpp.so.12()(64bit) libclang.so.12()(64bit) libclang.so.12(LLVM_12)(64bit) libclang12 libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) update-alternatives"

inherit rpm
