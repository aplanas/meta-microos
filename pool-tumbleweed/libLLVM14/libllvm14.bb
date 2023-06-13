SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "libLLVM14-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "509cb955c19c748b8d316aab39ae616da36769fad8a67e954f76d08e5e609d89ec3df164e4f2f13dc9d1e6d2df4330bc1c2b81cecef4f149afa8c4d0357a2b2a"

RPROVIDES:${PN} += "libLLVM.so.14()(64bit) \
libLLVM.so.14(LLVM_14)(64bit) \
libLLVM14 \
libLLVM14(aarch-64) \
libLLVMTableGen.so.14()(64bit) \
libRemarks.so.14()(64bit) \
libRemarks.so.14(LLVM_14)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libedit.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
