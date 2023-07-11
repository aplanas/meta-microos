SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "clang15-doc-15.0.7-3.1.noarch.rpm"
RPM_HASH = "cd130e871221919d879ef048bc9d36ed028cfe7d609f07d0569dc701c1be1f7b28674b79716a703f25bddd761e4b54e5d02a9c633e31352cd92819ab278c2543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang15-doc"

RDEPENDS:${PN} += ""

inherit rpm
