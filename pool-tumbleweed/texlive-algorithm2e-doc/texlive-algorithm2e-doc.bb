SUMMARY = "Documentation for texlive-algorithm2e"
DESCRIPTION = "This package includes the documentation for texlive-algorithm2e"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.2svn44846"

RPM_NAME = "texlive-algorithm2e-doc-2023.209.5.2svn44846-55.1.noarch.rpm"
RPM_HASH = "0ad63bd5c15bacd2b5d6785f4e17f06bae7277aa878629321ef9f60f62fe07b180384c78d3a553ed79f964112132a3293a55bc42275db2e8a7d54b0d487a9337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algorithm2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
