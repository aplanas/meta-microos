SUMMARY = "Documentation for texlive-dinbrief"
DESCRIPTION = "This package includes the documentation for texlive-dinbrief"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-dinbrief-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "9289f1c5f38e010a6666960d498a11e472cfe8165497c23c88987238da3bdcae7beddf9ca71287ee0de166eb3d52503a1fa463d8ea4a239773448a77c2d2d91b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-dinbrief-doc:de;en) \
texlive-dinbrief-doc"

RDEPENDS:${PN} += ""

inherit rpm
