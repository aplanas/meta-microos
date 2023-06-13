SUMMARY = "Documentation for texlive-belleek"
DESCRIPTION = "This package includes the documentation for texlive-belleek"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn66115"

RPM_NAME = "texlive-belleek-doc-2023.201.svn66115-53.1.noarch.rpm"
RPM_HASH = "930c4b1f759e7c305943b1eeb625b609a6354a1dda891517850d336dd8a777f7c302e69187bb63d60b72055fa6336389fcd49d5aa1a0bdd0a65cdc7780917112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-belleek-doc"

RDEPENDS:${PN} += ""

inherit rpm
