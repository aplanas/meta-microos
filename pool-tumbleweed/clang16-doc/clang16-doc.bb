SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "clang16-doc-16.0.6-1.1.noarch.rpm"
RPM_HASH = "6bdc1a42db3b0ff84e6685a9d48d05c2e09f7f6fa463f677bc9394198dc752f9216eb8942e3a11ce8892e2541f88cc130005b0db4ea72c0ced6bedd90a917e12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang16-doc"

RDEPENDS:${PN} += ""

inherit rpm
