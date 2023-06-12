SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "python3-clang15-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "69357e589cfc74bc9eba1b7d16a0f39b2ab3da776f85341dc196243795b6a7f56f33d0634061a4783bae1fe84f1e0b492897be8f0df1f64e23525163ba7cbe5b"

RPROVIDES:${PN} += "/usr/lib64/python3.10/site-packages/clang/ \
python3-clang15 \
python3-clang15(aarch-64)"
RDEPENDS:${PN} += "libclang13 \
python(abi) \
python3-base"

inherit rpm
