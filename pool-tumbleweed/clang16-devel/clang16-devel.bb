SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "clang16-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "6f78c908db20c18e613ae77a89cecc7b8a3890ca02c09e760e35dc9cc0e38b468c597a7213b313af80ef3853759bc626920cdab56cda10d031d65f02b94ecbd3"

RPROVIDES:${PN} += "clang16-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang16 \
libclang-cpp16 \
libclang13 \
llvm16-devel"

inherit rpm
