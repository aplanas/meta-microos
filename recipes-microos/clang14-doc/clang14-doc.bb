SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "clang14-doc-14.0.6-8.1.noarch.rpm"
RPM_HASH = "7411ae02248418b663c8451d6730fc071793dc748747abdaed13b17a6c5887a819e3dcb5047dbecb361a2a19e603e33c8dee1f1c09f1243d297fc76ca0ed76a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider clang14-doc"
RDEPENDS:${PN} += ""

inherit rpm
