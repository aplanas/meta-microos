SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "clang16-devel-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "17ea080041741b9bb3614252d55a5d2c5864e1a375eef02f119d25e94cde4c8e0b7c6d914fedbc0ed004f2790944c9d2c2abf535fa6c4aeb58246e6c4feaeeff"

RPROVIDES:${PN} += "clang16-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang16 \
libclang-cpp16 \
libclang13 \
llvm16-devel"

inherit rpm
