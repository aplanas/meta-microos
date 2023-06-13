SUMMARY = "Documentation for texlive-uhrzeit"
DESCRIPTION = "This package includes the documentation for texlive-uhrzeit"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2csvn39570"

RPM_NAME = "texlive-uhrzeit-doc-2023.201.0.0.2csvn39570-53.1.noarch.rpm"
RPM_HASH = "dbdf7b47289eaf441237ddef855a67260cd0ac3f35fc7569e5b3b4de23a89cc4f44f25e09a9706c22440ec102fb519b42c765fe68a32d3084049e158fba6f9f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uhrzeit-doc"

RDEPENDS:${PN} += ""

inherit rpm
