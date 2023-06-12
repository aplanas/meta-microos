SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-devel-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "1a2b29f934e65d8e17a8dc25944b52de7c5bca2b9ed37907c1be652c87e797ed245ae7d5ada65f2c1352410399fb15ccc11b675d723868b4bad46ca7cf830f7d"

RPROVIDES:${PN} += "cmake(LLVM) \
cmake(LLVM-) \
llvm-devel-provider \
llvm11-devel \
llvm11-devel(aarch-64) \
rpm_macro(_libcxx_sonum) \
rpm_macro(_llvm_minorver) \
rpm_macro(_llvm_relver) \
rpm_macro(_llvm_sonum) \
rpm_macro(_llvm_version) \
rpm_macro(_llvm_with_clang_scripts) \
rpm_macro(_llvm_with_ffi) \
rpm_macro(_llvm_with_libcxx) \
rpm_macro(_llvm_with_lldb) \
rpm_macro(_llvm_with_openmp) \
rpm_macro(_llvm_with_oprofile) \
rpm_macro(_llvm_with_valgrind)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.11()(64bit) \
libLLVM.so.11(LLVM_11)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++-devel \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libtool \
llvm11 \
llvm11-LTO-devel \
llvm11-gold \
llvm11-polly-devel \
pkgconfig"

inherit rpm
