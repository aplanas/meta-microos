SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "clang15-devel-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "a8b32d97d19bb4816f5d166ecd55c30c2e0982467c846b148e9db4e0bd3d0f867f5a15ccd56dc43dffb66571d6099fb22677baefdac82a505556a56402daef60"

RPROVIDES:${PN} += "clang15-devel \
clang15-devel(aarch-64) \
cmake(Clang)"
RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang15 \
libclang-cpp15 \
libclang13 \
llvm15-devel"

inherit rpm
