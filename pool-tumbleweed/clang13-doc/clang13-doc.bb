SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "clang13-doc-13.0.1-9.1.noarch.rpm"
RPM_HASH = "c32949c1533426100cb3796ec7f6c53902a24360c12c9c55645c02709c619c120650185c46f5748f589320235c1a76f63e489c50d58d266403ad99c28c5f8175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang13-doc"

RDEPENDS:${PN} += ""

inherit rpm
