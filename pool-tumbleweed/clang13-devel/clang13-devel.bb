SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "clang13-devel-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "50b61bbd8dfea8d7d18bea83038655ca3152792d6576a8b6b1b00d266645a0c83c7a079312f86fad49eb23800b43cc711f1d13e618a87c749155dc6e1258db43"

RPROVIDES:${PN} += "clang13-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang13 \
libclang-cpp13 \
libclang13 \
llvm13-devel"

inherit rpm
