SUMMARY = "Documentation for texlive-mugsthesis"
DESCRIPTION = "This package includes the documentation for texlive-mugsthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64259"

RPM_NAME = "texlive-mugsthesis-doc-2023.201.1.1svn64259-54.1.noarch.rpm"
RPM_HASH = "d963fef5b6b63fc6c2e3bb99442fa6aedbce1e2d5cb6354740263caeb9c4d1f1b1ee316efa8a9025f51bb0aa2629542685610b0d25729bdb8867932a06b0bd21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mugsthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
