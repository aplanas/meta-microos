SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "clang14-devel-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "a8f1c03f49a69e86e0c8a437f6de3d8c93acae61b797bfe52e9ed4cd85133aaed6905a441e4e3d76931dd765a10b663ca84e6369995f8ee4500cbe7a27e88958"

RPROVIDES:${PN} += "clang14-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang14 \
libclang-cpp14 \
libclang13 \
llvm14-devel"

inherit rpm
