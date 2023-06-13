SUMMARY = "Documentation for texlive-simples-matrices"
DESCRIPTION = "This package includes the documentation for texlive-simples-matrices"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn63802"

RPM_NAME = "texlive-simples-matrices-doc-2023.201.1.0.1svn63802-53.1.noarch.rpm"
RPM_HASH = "24d3b18c5bc64241a25bb05e9bca8d7e4ce3fbefa1899628c4c47f562eef8c1a459d0e657deb017300854ad34563bc0f59805b5dda1c725124c646f1bd9b5ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-simples-matrices-doc:fr;en) \
texlive-simples-matrices-doc"

RDEPENDS:${PN} += ""

inherit rpm
