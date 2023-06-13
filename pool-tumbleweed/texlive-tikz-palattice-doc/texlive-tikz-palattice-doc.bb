SUMMARY = "Documentation for texlive-tikz-palattice"
DESCRIPTION = "This package includes the documentation for texlive-tikz-palattice"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn43442"

RPM_NAME = "texlive-tikz-palattice-doc-2023.201.2.3svn43442-52.1.noarch.rpm"
RPM_HASH = "8a1daee459482d45d2d3c515282d8239484ec3893b030cc89c982d471cf2965e0b376599ef788214371a912dfc419fb26291a053b6252cb6c9fb8c28c9cf7128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-palattice-doc"

RDEPENDS:${PN} += ""

inherit rpm
