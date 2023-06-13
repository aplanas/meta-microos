SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "llvm16-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "157950e9aff7534f058e0ba3da7431da593f9931b63e1a49f838b20fce5119df2396ffa88c587436cd4020859c4918f0ef175df87d4e9918054156cd68f6c185"

RPROVIDES:${PN} += "cmake(LLVM) \
cmake(LLVM-) \
libLTO.so \
llvm-devel-provider \
llvm16-devel \
llvm16-devel(aarch-64) \
rpm_macro(_libclang_sonum) \
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
libLLVM16 \
libLTO16 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libomp16-devel \
libstdc++-devel \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libtool \
llvm16 \
llvm16-gold \
llvm16-polly-devel \
pkgconfig"

inherit rpm
