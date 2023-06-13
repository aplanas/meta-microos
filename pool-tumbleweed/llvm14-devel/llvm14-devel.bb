SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-devel-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "f987e99503a0c392dc8b8a2a2a8e32b8339a08a7fa302c4dbbbce04a71c441b062560316e2597dbbb4fe8dd47dc870583c7f876402bb9b130d4327bd8430d139"

RPROVIDES:${PN} += "cmake(LLVM) \
cmake(LLVM-) \
libLTO.so \
llvm-devel-provider \
llvm14-devel \
llvm14-devel(aarch-64) \
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
libLLVM14 \
libLTO14 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libomp14-devel \
libstdc++-devel \
libstdc++.so.6()(64bit) \
libtool \
llvm14 \
llvm14-gold \
llvm14-polly-devel \
pkgconfig"

inherit rpm
