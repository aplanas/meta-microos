SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "libLLVM11-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "88b78cb416b3b42613997c102b9b0c8bea1243180b8286c75dfda2a5ae87e7c179379f561c58cb0bb4bebc32a98b52e4eac888c8b3806a64654c55f14c27cd5d"

RPROVIDES:${PN} += "libLLVM.so.11()(64bit) \
libLLVM.so.11(LLVM_11)(64bit) \
libLLVM11 \
libLLVM11(aarch-64) \
libLLVMTableGen.so.11()(64bit) \
libRemarks.so.11()(64bit) \
libRemarks.so.11(LLVM_11)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libedit.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
