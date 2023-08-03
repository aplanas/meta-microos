SUMMARY = "Documentation for texlive-lmake"
DESCRIPTION = "This package includes the documentation for texlive-lmake"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25552"

RPM_NAME = "texlive-lmake-doc-2023.209.1.0svn25552-55.1.noarch.rpm"
RPM_HASH = "d0ff16369ba608a22a1981fe6d38f61e24dfd1c0eab56acd16e8bf28151c34fc8f24e81a49c6b117aa32beacc654ca64489e7f0a84db074f8596d46e47fd3c7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lmake-doc"

RDEPENDS:${PN} += ""

inherit rpm
