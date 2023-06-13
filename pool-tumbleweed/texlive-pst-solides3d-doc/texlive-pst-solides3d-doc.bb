SUMMARY = "Documentation for texlive-pst-solides3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-solides3d"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.34asvn61719"

RPM_NAME = "texlive-pst-solides3d-doc-2023.201.4.34asvn61719-53.1.noarch.rpm"
RPM_HASH = "6209db7af7366b0a424678373315c304667c81abcabdeaa805c45974a94de4b9c5130e6081ad5058049344ca302200ed68d5ba54a71c0a3b7d18a7f6218d7791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-solides3d-doc:en) \
texlive-pst-solides3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
