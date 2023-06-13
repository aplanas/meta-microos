SUMMARY = "Documentation for texlive-eulerpx"
DESCRIPTION = "This package includes the documentation for texlive-eulerpx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn63967"

RPM_NAME = "texlive-eulerpx-doc-2023.201.1.0svn63967-52.1.noarch.rpm"
RPM_HASH = "a8409dd1ffed39e86e4dfb263b37ee3e37c1bcade101425706fdc9a4ecece83b72d2ae7ce840558cccc1f2e00ebc47bc862c71ca73815e1256db9d2631cd224d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eulerpx-doc"

RDEPENDS:${PN} += ""

inherit rpm
