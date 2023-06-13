SUMMARY = "Documentation for texlive-brandeis-thesis"
DESCRIPTION = "This package includes the documentation for texlive-brandeis-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn59832"

RPM_NAME = "texlive-brandeis-thesis-doc-2023.201.3.2svn59832-52.1.noarch.rpm"
RPM_HASH = "f83f3be19aafaf9b6b2c7f708975c2f1f6f0498450a249161fa30f5009486a659f33f5343dbc723eaa857a6bfbe964ace824fc00731103c65195bc0135a557c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brandeis-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
