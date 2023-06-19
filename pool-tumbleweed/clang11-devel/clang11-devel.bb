SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "clang11-devel-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "843c9a96442519a0d46dc450d65253049c667d58d06290729b82ef7dee6ee726181b7b112c4b5d9bc885e140d324b7a0b22d259a8ca863ff7d261f33b40f50dd"

RPROVIDES:${PN} += "clang11-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang11 \
llvm11-devel"

inherit rpm
