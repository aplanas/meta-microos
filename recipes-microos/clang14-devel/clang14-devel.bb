SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "clang14-devel-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "dda010857fff074dc0adb03f3318758e5f741a22ff70efcb8286638618d67054866e424991a4a722e5b5e20e2c023f62f750195c95e7d6d5f85556a736ff3dab"

RPROVIDES:${PN} += "clang14-devel \
clang14-devel(aarch-64) \
cmake(Clang)"
RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang14 \
libclang-cpp14 \
libclang13 \
llvm14-devel"

inherit rpm
