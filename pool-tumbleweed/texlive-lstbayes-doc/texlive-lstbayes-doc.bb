SUMMARY = "Documentation for texlive-lstbayes"
DESCRIPTION = "This package includes the documentation for texlive-lstbayes"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48160"

RPM_NAME = "texlive-lstbayes-doc-2023.201.svn48160-52.1.noarch.rpm"
RPM_HASH = "5846c63b0ca515053bc20bcfa0cf80ba2b05a8830381319d9f4d3ed6fd0ee8f85ba57a6482829896c67c1de39b82659e896432e5c790967ba0599ac3c4fea43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lstbayes-doc"

RDEPENDS:${PN} += ""

inherit rpm
