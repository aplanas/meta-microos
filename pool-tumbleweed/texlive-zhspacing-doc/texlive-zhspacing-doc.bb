SUMMARY = "Documentation for texlive-zhspacing"
DESCRIPTION = "This package includes the documentation for texlive-zhspacing"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn41145"

RPM_NAME = "texlive-zhspacing-doc-2023.201.svn41145-52.1.noarch.rpm"
RPM_HASH = "0cf7dd79521d3206d6ca17a01d23472121cabd21c32c3ac3f661f1cd80524ff5bc7b1004918dde967dab0268979458fa58b701f1f8f33b209b333a3925415db5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhspacing-doc"

RDEPENDS:${PN} += ""

inherit rpm
