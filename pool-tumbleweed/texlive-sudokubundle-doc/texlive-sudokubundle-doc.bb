SUMMARY = "Documentation for texlive-sudokubundle"
DESCRIPTION = "This package includes the documentation for texlive-sudokubundle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn15878"

RPM_NAME = "texlive-sudokubundle-doc-2023.201.1.0asvn15878-57.1.noarch.rpm"
RPM_HASH = "3b7e558901ff396a4722f621550db901a166a0e897e4f6a89bb2150c7ce4b133ea5ede92dc78bc52e4207f503cef78aa8dda73f8ac307e16fa67e8b4c336f61e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sudokubundle-doc"

RDEPENDS:${PN} += ""

inherit rpm
