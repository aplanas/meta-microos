SUMMARY = "Documentation for texlive-xpicture"
DESCRIPTION = "This package includes the documentation for texlive-xpicture"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn28770"

RPM_NAME = "texlive-xpicture-doc-2023.201.1.2asvn28770-52.2.noarch.rpm"
RPM_HASH = "20ae9a38c57097adc0ef80189e5b430f6898cf470662c7551a803329e02334196d7c43a29f95d2c81f963c6ff3e2f3347bc99fab8862b7ba667dbf2b5673637a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpicture-doc"

RDEPENDS:${PN} += ""

inherit rpm
