SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "python3-clang-16.0.6-1.1.noarch.rpm"
RPM_HASH = "d08b3298a8bfdeeea64cf59674d5623be87d9591629fc4669b5079c6eba4c0072e5da3c8a61980d7d9394fa01af987ea6adac3887aa9eaef9c4610ee08dddada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clang"

RDEPENDS:${PN} += "python3-clang16"

inherit rpm
