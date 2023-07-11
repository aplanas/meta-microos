SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "python3-clang14-14.0.6-10.1.noarch.rpm"
RPM_HASH = "c4cac8ea8f4ff0adb7703647154f982a8f8c81ee1d366f029e003599530a2b0f1557501c0847260f15255339b56c2624ba5c5599f786487259a91ee914ca322d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib/python3.11/site-packages/clang/ \
python3-clang14"

RDEPENDS:${PN} += "libclang13 \
python-abi \
python3-base"

inherit rpm
