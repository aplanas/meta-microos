SUMMARY = "Documentation for texlive-njurepo"
DESCRIPTION = "This package includes the documentation for texlive-njurepo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn50492"

RPM_NAME = "texlive-njurepo-doc-2023.209.1.1.2svn50492-55.1.noarch.rpm"
RPM_HASH = "c78bbb06a609da2d4f13b58eb8cfa9c95fd71d3c3e8662426b1c1cfcb45cc7b600abb6eea9ec6c5d64783c9eb46e518a9e10a77e9afd28caf63abef940853fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-njurepo-doc"

RDEPENDS:${PN} += ""

inherit rpm
