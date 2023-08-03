SUMMARY = "Documentation for texlive-lectures"
DESCRIPTION = "This package includes the documentation for texlive-lectures"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.5svn53642"

RPM_NAME = "texlive-lectures-doc-2023.209.1.0.5svn53642-55.1.noarch.rpm"
RPM_HASH = "1f6f21d3f756c091a45fc67acd71f6e84267d780904a47e3143754393fd9c297fbbe3adec1c272cdddc8e4b90a5f2ceb5e3c346fcb415f841a7d4773a7479c01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lectures-doc"

RDEPENDS:${PN} += ""

inherit rpm
