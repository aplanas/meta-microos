SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "python3-clang-16.0.4-1.1.noarch.rpm"
RPM_HASH = "d508b13d2fdda6bdfc91f70fd9e7e8461b377ba15d0b3f4370b68f84a58ad77ab635a10158560132d4faf2168736ea85fb8e908350d20e579310445c8410ff4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clang"

RDEPENDS:${PN} += "python3-clang16"

inherit rpm
