SUMMARY = "Documentation for texlive-tikz-dependency"
DESCRIPTION = "This package includes the documentation for texlive-tikz-dependency"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn54512"

RPM_NAME = "texlive-tikz-dependency-doc-2023.201.1.2svn54512-54.1.noarch.rpm"
RPM_HASH = "171898d85b2b5f14463a0fb23688f47d00260a7ab91b3d60b069fd313fb67c6ff7a8aa767063ec1baccd7020b3ccf93786f9444bd373c6511feba68b26a0b6a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-dependency-doc"
RDEPENDS:${PN} += ""

inherit rpm
