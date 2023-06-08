SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "clang16-doc-16.0.2-1.1.noarch.rpm"
RPM_HASH = "308446632a9e149b9e8f25e50306718d0e8b3917dde2e9076d7bdb0242d218c686c5954df876cb81ebea6d1fec42789545d7a629beef7898c366b57583cf97a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider clang16-doc"
RDEPENDS:${PN} += ""

inherit rpm
