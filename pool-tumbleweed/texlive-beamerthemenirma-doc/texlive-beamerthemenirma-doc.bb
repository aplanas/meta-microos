SUMMARY = "Documentation for texlive-beamerthemenirma"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemenirma"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn20765"

RPM_NAME = "texlive-beamerthemenirma-doc-2023.209.0.0.1svn20765-54.1.noarch.rpm"
RPM_HASH = "9d80fa71969114e5a9ff7a855e219e2a64a758e429e694d595981600a62b3f1d9365fd1906ee10ec65e1524a434596922ee67bacaf6d655f507ad86785e49875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemenirma-doc"

RDEPENDS:${PN} += ""

inherit rpm
