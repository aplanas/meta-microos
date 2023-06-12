SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-devel-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "623b8380904882b0a635efb146cd48b9cb511fe84d8eaa93fdc25223bdd04b758ab5bc57b848c592dd414155f3e3d12e1f1c1601c6aadf52b191ad76a7945e83"

RPROVIDES:${PN} += "cmake(LLVM) \
cmake(LLVM-) \
libLTO.so \
llvm-devel-provider \
llvm13-LTO-devel \
llvm13-devel \
llvm13-devel(aarch-64) \
rpm_macro(_libcxx_sonum) \
rpm_macro(_llvm_minorver) \
rpm_macro(_llvm_relver) \
rpm_macro(_llvm_sonum) \
rpm_macro(_llvm_version) \
rpm_macro(_llvm_with_ffi) \
rpm_macro(_llvm_with_libcxx) \
rpm_macro(_llvm_with_lldb) \
rpm_macro(_llvm_with_openmp) \
rpm_macro(_llvm_with_oprofile) \
rpm_macro(_llvm_with_valgrind)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.13()(64bit) \
libLLVM.so.13(LLVM_13)(64bit) \
libLLVM13 \
libLTO13 \
libc.so.6(GLIBC_2.36)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libomp13-devel \
libstdc++-devel \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libtool \
llvm13 \
llvm13-gold \
llvm13-polly-devel \
pkgconfig"

inherit rpm
