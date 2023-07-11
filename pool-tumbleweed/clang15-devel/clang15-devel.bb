SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "clang15-devel-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "2a3a4a1a329c553a8e3024da23969bf624f612f7a65f066e6f934bdae19f9749e3bea0975edec16d797f777b9052beaee209b079562862c3ae538aed8739a49a"

RPROVIDES:${PN} += "clang15-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang15 \
libclang-cpp15 \
libclang13 \
llvm15-devel"

inherit rpm
