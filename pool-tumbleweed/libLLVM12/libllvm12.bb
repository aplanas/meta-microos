SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "libLLVM12-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "462f41fa7d0a8dce1c371dc1fe86f17868559f614a2742ec0234cd3bfe2fc56b529663c3b4af94787f483bce8c4e0f4a5d5f459dd5e3ddb106cc37e90950de87"

RPROVIDES:${PN} += "libLLVM.so.12()(64bit) \
libLLVM.so.12(LLVM_12)(64bit) \
libLLVM12 \
libLLVM12(aarch-64) \
libLLVMTableGen.so.12()(64bit) \
libRemarks.so.12()(64bit) \
libRemarks.so.12(LLVM_12)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libedit.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
