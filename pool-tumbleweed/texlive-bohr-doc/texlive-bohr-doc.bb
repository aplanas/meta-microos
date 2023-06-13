SUMMARY = "Documentation for texlive-bohr"
DESCRIPTION = "This package includes the documentation for texlive-bohr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn62977"

RPM_NAME = "texlive-bohr-doc-2023.201.1.0svn62977-52.1.noarch.rpm"
RPM_HASH = "88559029c6a410582ac7ccf9880381670b5cd4b25695c99a3cab1a37ed0884557c8973b30b114ba0ddcc13becb4dbd69b5acf429e9611b359fcfdb0a48d0ffc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bohr-doc"

RDEPENDS:${PN} += ""

inherit rpm
