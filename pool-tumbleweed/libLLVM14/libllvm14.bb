SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "libLLVM14-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "509cb955c19c748b8d316aab39ae616da36769fad8a67e954f76d08e5e609d89ec3df164e4f2f13dc9d1e6d2df4330bc1c2b81cecef4f149afa8c4d0357a2b2a"

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
