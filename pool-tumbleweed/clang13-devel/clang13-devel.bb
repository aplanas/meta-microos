SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "clang13-devel-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "1116b0cdbf76d03f0509ee9de4374ad1b49185003dcc61a485750694cf26830174af364ad0e5932ec474fb9253ce5a9645cd2baa60956267ac6f0185785f7541"

RPROVIDES:${PN} += "clang13-devel \
clang13-devel(aarch-64) \
cmake(Clang)"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang13 \
libclang-cpp13 \
libclang13 \
llvm13-devel"

inherit rpm
