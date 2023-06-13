SUMMARY = "Documentation for texlive-pixelart"
DESCRIPTION = "This package includes the documentation for texlive-pixelart"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn66012"

RPM_NAME = "texlive-pixelart-doc-2023.201.1.0.2svn66012-51.1.noarch.rpm"
RPM_HASH = "a2aedaf9761408625f0551cf8cc09e14569e28e32d36ec5bf4fcd49b68880343c211410adfec1186257dfda55fdde295bf80f98a9287e9a71a5aee924cead3ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pixelart-doc"

RDEPENDS:${PN} += ""

inherit rpm
