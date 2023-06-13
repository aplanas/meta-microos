SUMMARY = "Documentation for texlive-incgraph"
DESCRIPTION = "This package includes the documentation for texlive-incgraph"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn60810"

RPM_NAME = "texlive-incgraph-doc-2023.201.1.2.0svn60810-52.1.noarch.rpm"
RPM_HASH = "1073abca873cf7eb7a283e8e493803490528ca553dbafe97a9a2da798ec05b0b45456611a1dc0046a7cdc7023026532a6bec1a9dae495ac288cf3a54ce45bc0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-incgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
