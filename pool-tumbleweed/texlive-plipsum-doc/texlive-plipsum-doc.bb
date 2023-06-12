SUMMARY = "Documentation for texlive-plipsum"
DESCRIPTION = "This package includes the documentation for texlive-plipsum"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.3svn30353"

RPM_NAME = "texlive-plipsum-doc-2023.201.4.3svn30353-52.1.noarch.rpm"
RPM_HASH = "5792c8c4d7f1ea05a01ed27420bdab276eaad1d0bd3b9f012dcbb81a280590ec0e1c806365ea0905f04c5a6a27b00d26c2eec51de4067f11256a018d06e9606b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plipsum-doc"
RDEPENDS:${PN} += ""

inherit rpm
