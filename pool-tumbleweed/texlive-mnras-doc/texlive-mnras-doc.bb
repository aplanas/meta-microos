SUMMARY = "Documentation for texlive-mnras"
DESCRIPTION = "This package includes the documentation for texlive-mnras"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn55729"

RPM_NAME = "texlive-mnras-doc-2023.209.3.1svn55729-55.1.noarch.rpm"
RPM_HASH = "5e844ae2a0ee30dc7c3a52a52bbc707cc345c558520152442eab4bb2acc5f2d312bcfe70dd8e913400f78ba47bb38c2211cbe6d7bcf00439f50c422557054463"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mnras-doc"

RDEPENDS:${PN} += ""

inherit rpm
