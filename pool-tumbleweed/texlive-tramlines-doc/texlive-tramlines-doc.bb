SUMMARY = "Documentation for texlive-tramlines"
DESCRIPTION = "This package includes the documentation for texlive-tramlines"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn65692"

RPM_NAME = "texlive-tramlines-doc-2023.201.1.1.0svn65692-52.1.noarch.rpm"
RPM_HASH = "a03f68a2091b8402d86ee9318e1b207e6820ebeaa443628ec6ebbf4c3fc8dc8bb677b3f254677b81ceef627c05cc91f7057bfb3f00496dd9abb116643e3db239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tramlines-doc"
RDEPENDS:${PN} += ""

inherit rpm
