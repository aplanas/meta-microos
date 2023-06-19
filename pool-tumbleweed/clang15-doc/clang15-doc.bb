SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "clang15-doc-15.0.7-2.4.noarch.rpm"
RPM_HASH = "0265887f08cf40dc39e59009a45a840e499b225a315b5bd81216b44e8fa2f7e94dc2a5c7c64ae5b840b9196e3e2e13c424ba2ebd3e77df7bb41c6cd5497075de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang15-doc"

RDEPENDS:${PN} += ""

inherit rpm
