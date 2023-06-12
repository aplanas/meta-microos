SUMMARY = "Documentation for texlive-polynom"
DESCRIPTION = "This package includes the documentation for texlive-polynom"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19svn44832"

RPM_NAME = "texlive-polynom-doc-2023.201.0.0.19svn44832-52.1.noarch.rpm"
RPM_HASH = "58f2c541ea98931b02d1c8b33ff6e7042133dae4465261baf2431de50b50ed804662cf6076d322a34e39de683d82da24d6ffc1289bf33cda22f2ce8d0e0c8867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polynom-doc"
RDEPENDS:${PN} += ""

inherit rpm
