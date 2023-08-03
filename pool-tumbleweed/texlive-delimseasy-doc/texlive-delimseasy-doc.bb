SUMMARY = "Documentation for texlive-delimseasy"
DESCRIPTION = "This package includes the documentation for texlive-delimseasy"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn39589"

RPM_NAME = "texlive-delimseasy-doc-2023.209.2.0svn39589-53.1.noarch.rpm"
RPM_HASH = "20f29e4ba39258df73f8fb27ecef3cc5c82534ae38af4ca14f3a0593d46b78428501d5131c846049e4ebae389f9beb384010e1430cea76d06ce9755ffdef2560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delimseasy-doc"

RDEPENDS:${PN} += ""

inherit rpm
