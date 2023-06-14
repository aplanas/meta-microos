SUMMARY = "Documentation for texlive-makecell"
DESCRIPTION = "This package includes the documentation for texlive-makecell"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1esvn15878"

RPM_NAME = "texlive-makecell-doc-2023.201.0.0.1esvn15878-52.1.noarch.rpm"
RPM_HASH = "07163d82ee8a2d6e5413744d0e17c4526b4212e07617f388311c42364d14c8e964d0d26c1ea5ce433bd5ce2391bf4a4e87b6ed01cf039ea04bdd671b78aa9510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-makecell-doc-ru;en \
texlive-makecell-doc"

RDEPENDS:${PN} += ""

inherit rpm
