SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "libLLVM15-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "a10e2c5126fd2f8924ee4cf2a03b05b455d0c5fd3c2bc3f5f202e21aac099f1d6c1a87737cb308b25571cbf181ad2ac71aade043536db5bbce5e0261903c14dd"

RPROVIDES:${PN} += "libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libLLVM15 \
libLLVM15(aarch-64) \
libLLVMTableGen.so.15()(64bit) \
libRemarks.so.15()(64bit) \
libRemarks.so.15(LLVM_15)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libedit.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
