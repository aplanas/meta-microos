SUMMARY = "Documentation for texlive-newenviron"
DESCRIPTION = "This package includes the documentation for texlive-newenviron"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn29331"

RPM_NAME = "texlive-newenviron-doc-2023.201.1.0svn29331-54.1.noarch.rpm"
RPM_HASH = "e19467a2f1141f9ca7508c64a1191a1d04488df2869196520cad52443147a0e8c03cb89d116d775d3bfafb61a5404759eb6c257b49400760e1c994d8bff9101e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newenviron-doc"

RDEPENDS:${PN} += ""

inherit rpm
