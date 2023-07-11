SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "libLLVM14-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "b3c32fa9c01ea12766eab7b323ed7968a57b3a3266e79d1431beb2c5e07fa77a5c5fc93f0a48fa081b11a2dfcd0fa90aa533336a5a3b731e24b72fc6f811ae80"

RPROVIDES:${PN} += "libLLVM.so.14 \
libLLVM14 \
libLLVMTableGen.so.14 \
libRemarks.so.14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
