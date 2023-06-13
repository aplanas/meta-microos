SUMMARY = "Documentation for texlive-germbib"
DESCRIPTION = "This package includes the documentation for texlive-germbib"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-germbib-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "4038ab1d5bc2f8cca530cf41314eea0212b90bfcf58ab63a8371e650ee08fc174f2ec194bf1d7134721504a31f3b0ab1a2a3faf5f2576ba5b9983dc07fd1a3ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-germbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
