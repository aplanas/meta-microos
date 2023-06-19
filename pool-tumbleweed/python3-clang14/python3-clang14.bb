SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "python3-clang14-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "f042d1949cbc6d6bdd1574f3dce916a98304b2f46895729754392c106f7c345d847af5c6a8cda0dc8131a9d241ab6a79ae51ecff171016cc6f1ed02291c75081"

RPROVIDES:${PN} += "/usr/lib64/python3.10/site-packages/clang/ \
python3-clang14"

RDEPENDS:${PN} += "libclang13 \
python-abi \
python3-base"

inherit rpm
