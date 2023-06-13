SUMMARY = "Documentation for texlive-contour"
DESCRIPTION = "This package includes the documentation for texlive-contour"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.14svn18950"

RPM_NAME = "texlive-contour-doc-2023.204.2.14svn18950-54.1.noarch.rpm"
RPM_HASH = "117378fc1200c62dedbb96e936cce0396fce779bc5fc82ebe29e27283270e9d432bd30f009b0652afa57fef03af9fd8c0b1e4a42a3685aafbe0e5c86736d0101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-contour-doc"

RDEPENDS:${PN} += ""

inherit rpm
