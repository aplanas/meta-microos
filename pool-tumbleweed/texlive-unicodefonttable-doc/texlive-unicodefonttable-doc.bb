SUMMARY = "Documentation for texlive-unicodefonttable"
DESCRIPTION = "This package includes the documentation for texlive-unicodefonttable"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0gsvn65009"

RPM_NAME = "texlive-unicodefonttable-doc-2023.201.1.0gsvn65009-53.1.noarch.rpm"
RPM_HASH = "127bd69721c09c23df1cb78428a87efd4656fc19dd8d7877bd9e355e06f497f7de905134f61b2d0918c3b7c8eadb4855fce60d1e6e34a9e208f8b5fd04d5e9f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicodefonttable-doc"

RDEPENDS:${PN} += ""

inherit rpm
