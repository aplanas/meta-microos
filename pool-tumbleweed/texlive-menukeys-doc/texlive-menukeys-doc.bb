SUMMARY = "Documentation for texlive-menukeys"
DESCRIPTION = "This package includes the documentation for texlive-menukeys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6.2svn64314"

RPM_NAME = "texlive-menukeys-doc-2023.201.1.6.2svn64314-54.1.noarch.rpm"
RPM_HASH = "7b99d1b71a8c1ed7ddc0906d3617dd79464d1cf7a3dec1a394c68c06b037ea87247b0e81ec7202e9a8c38e8f250ac9fe9a2a4f3703b6fd67ba67d4aa77a33343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-menukeys-doc"

RDEPENDS:${PN} += ""

inherit rpm
