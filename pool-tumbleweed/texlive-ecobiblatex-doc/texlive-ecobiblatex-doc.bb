SUMMARY = "Documentation for texlive-ecobiblatex"
DESCRIPTION = "This package includes the documentation for texlive-ecobiblatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39233"

RPM_NAME = "texlive-ecobiblatex-doc-2023.201.1.0svn39233-53.2.noarch.rpm"
RPM_HASH = "19a9e74e92453271f1b536f9e21b82400509d0ac3c4e66c215cc77a8d2c1fe0dfaf7f8df9f5191483e2ea4ea8326db2577edbd5656af32f943c4d3d901875c5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecobiblatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
