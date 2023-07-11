SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "python3-clang13-13.0.1-10.1.noarch.rpm"
RPM_HASH = "3eae4a2441649e46d5615ca2ef5272bc981e84d70916cc43c35c1bf41a9d764ddaa7faa403a78fe0d8ac353d4506cc234f438b532c3a0165e0e167889ade12b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib/python3.11/site-packages/clang/ \
python3-clang13"

RDEPENDS:${PN} += "libclang13 \
python-abi \
python3-base"

inherit rpm
