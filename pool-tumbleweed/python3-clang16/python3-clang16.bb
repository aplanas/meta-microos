SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "python3-clang16-16.0.6-1.1.noarch.rpm"
RPM_HASH = "f9a8bf9f268c5be0567d38baf9d3edb8952269414b8a97a0770cc584a07c434ffbbead3da6f47fce15899d04c7aa6a1b5d180431bf99795166f639ba521a13c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib/python3.11/site-packages/clang/ \
python3-clang16"

RDEPENDS:${PN} += "libclang13 \
python-abi \
python3-base"

inherit rpm
