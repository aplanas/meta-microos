SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "clang12-devel-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "de3fa12892daffc4d72d4ce78844a6752f555ac887ec821a99c81bc3668b4e356938d47828faaee1e7ea7e2d16a5b23cab3fa40fe556f7dfe9725ba7db0b3bae"

RPROVIDES:${PN} += "clang12-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang12 \
llvm12-devel"

inherit rpm
