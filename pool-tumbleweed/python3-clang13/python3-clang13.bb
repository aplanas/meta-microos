SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "python3-clang13-13.0.1-9.1.noarch.rpm"
RPM_HASH = "7a53df954748debedc6ba01d738c288072ceec59b3aa08e967dcd4bac1d94d6635c7a9073a2c1fa8a15b33a27e0fae492ff0aee9ac44d33912824d484ecb07cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib64/python3.10/site-packages/clang/ \
python3-clang13"
RDEPENDS:${PN} += "libclang13 \
python(abi) \
python3-base"

inherit rpm
