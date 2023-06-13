SUMMARY = "Documentation for texlive-acro"
DESCRIPTION = "This package includes the documentation for texlive-acro"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.8svn62925"

RPM_NAME = "texlive-acro-doc-2023.201.3.8svn62925-54.1.noarch.rpm"
RPM_HASH = "c7feee51a6a7ca1a2d9d3901a0d330dd84e5090bd71bc5579e447b5aba731207e5996a60346744e97a92d0f7f71ee34c59986dcecbf1811d67514ba1d02d90f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acro-doc"

RDEPENDS:${PN} += ""

inherit rpm
