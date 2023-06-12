SUMMARY = "Documentation for texlive-midpage"
DESCRIPTION = "This package includes the documentation for texlive-midpage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn17484"

RPM_NAME = "texlive-midpage-doc-2023.201.1.1asvn17484-54.1.noarch.rpm"
RPM_HASH = "471848b002f8d3a9dc2341fb2c9b7b8392c7ee84b7a7b3b03942f13963d595725911a70503152570410b33b4cdbfd20ba2e53c483846cdc6f9cb09a13cd56ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-midpage-doc"
RDEPENDS:${PN} += ""

inherit rpm
