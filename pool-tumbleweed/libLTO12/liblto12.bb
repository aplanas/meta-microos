SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "libLTO12-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "f75d5488abde167c0eb524e2ad63b3c1e3d6cea169642b0030c52f8f9eb899a2af012612b071aeab16ab62acf978622b410dc24d599c19c8b1c1905829427611"

RPROVIDES:${PN} += "libLTO.so.12()(64bit) \
libLTO.so.12(LLVM_12)(64bit) \
libLTO12 \
libLTO12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.12()(64bit) \
libLLVM.so.12(LLVM_12)(64bit) \
libLLVM12 \
libc.so.6(GLIBC_2.32)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
