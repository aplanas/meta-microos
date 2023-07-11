SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "libLLVM13-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "bbeedb7bde76dfda5c953245d80ff4e05714911c92bdce8de2b405faad4ff30af5c0c9f0e31678e40f959360117db5d0e9df7f9db87bd3d1f2d06aaf8a20bb8b"

RPROVIDES:${PN} += "libLLVM.so.13 \
libLLVM13 \
libLLVMTableGen.so.13 \
libRemarks.so.13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
