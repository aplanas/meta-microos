SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libLTO16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "f379cbca3a2b5cc5ed5bce248b2e6afb2f48350105c4a1bdc5d11372d3aa68c9e8539ce212e4b5dec863fa55e4dd5a09b8bc01e0dc9a956f1b4a6a6e85d1bfd3"

RPROVIDES:${PN} += "libLTO.so.16()(64bit) \
libLTO.so.16(LLVM_16)(64bit) \
libLTO16 \
libLTO16(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
