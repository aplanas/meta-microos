SUMMARY = "Documentation for texlive-uhhassignment"
DESCRIPTION = "This package includes the documentation for texlive-uhhassignment"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44026"

RPM_NAME = "texlive-uhhassignment-doc-2023.209.1.0svn44026-54.1.noarch.rpm"
RPM_HASH = "1d0e21bbc21b09155acaadf38250ee8120a4558c6fbafbdd5fa275b2efd95010440277ede4a004d10d8939b87622d41e7369cbe99a876c096d98c0f2fc6609dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uhhassignment-doc"

RDEPENDS:${PN} += ""

inherit rpm
