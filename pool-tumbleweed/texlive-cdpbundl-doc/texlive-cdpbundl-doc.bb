SUMMARY = "Documentation for texlive-cdpbundl"
DESCRIPTION = "This package includes the documentation for texlive-cdpbundl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.36dsvn61719"

RPM_NAME = "texlive-cdpbundl-doc-2023.201.0.0.36dsvn61719-52.1.noarch.rpm"
RPM_HASH = "77e6d1f0dfea5c237b73422e3ef1c85e5c88e7ff806214584c674f1d0be493583cafb6fb614da5d3f384810bfaada122664b97f095756fcfe15acd0aa4f983c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cdpbundl-doc"

RDEPENDS:${PN} += ""

inherit rpm
