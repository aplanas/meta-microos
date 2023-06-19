SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "libLLVM15-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "a10e2c5126fd2f8924ee4cf2a03b05b455d0c5fd3c2bc3f5f202e21aac099f1d6c1a87737cb308b25571cbf181ad2ac71aade043536db5bbce5e0261903c14dd"

RPROVIDES:${PN} += "libLLVM.so.15 \
libLLVM15 \
libLLVMTableGen.so.15 \
libRemarks.so.15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
