SUMMARY = "Documentation for texlive-ifthenx"
DESCRIPTION = "This package includes the documentation for texlive-ifthenx"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn25819"

RPM_NAME = "texlive-ifthenx-doc-2023.201.0.0.1asvn25819-52.1.noarch.rpm"
RPM_HASH = "9819a873e1547f9a38ac01093fd149c7c958ef9cc7b3ff86a40c5abdcafd632685c28ffdadbd65be53d25956c9d3311650d589729393e75ed3193012a0d1e0a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifthenx-doc"

RDEPENDS:${PN} += ""

inherit rpm
