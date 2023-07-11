SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "libLLVM15-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "c2a8526ce2a50015859261ed1b27e88940bec1d480d9b63c08a9b9dca4d520904e190bf44af3769a9c25b97b12cc7f0e648745d0d751b405125bef788a955604"

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
