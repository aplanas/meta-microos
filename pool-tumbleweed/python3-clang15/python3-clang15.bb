SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "python3-clang15-15.0.7-3.1.noarch.rpm"
RPM_HASH = "e7185806c201c1e1785b2eb5edcd76b1357fe5bf6347502734773a3aa639d414f242e5064ccf07cf45f4c6245ec7d80dcfcc22e66ddb84be1422f7c5277719cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib/python3.11/site-packages/clang/ \
python3-clang15"

RDEPENDS:${PN} += "libclang13 \
python-abi \
python3-base"

inherit rpm
