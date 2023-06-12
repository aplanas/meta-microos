SUMMARY = "Documentation for texlive-colordoc"
DESCRIPTION = "This package includes the documentation for texlive-colordoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18270"

RPM_NAME = "texlive-colordoc-doc-2023.201.svn18270-53.1.noarch.rpm"
RPM_HASH = "b9bcd13f2cd078f71d0997870d51ba7cf89695a84a55e837e1c19d8da1d1d422b2b5d34260d72d73d0008c314adfe44305204a17ead40295e27b0055351404f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colordoc-doc"
RDEPENDS:${PN} += ""

inherit rpm
