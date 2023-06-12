SUMMARY = "Documentation for texlive-synproof"
DESCRIPTION = "This package includes the documentation for texlive-synproof"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-synproof-doc-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "851431f1b1b03094102909562976c6f452a5d3d86ffcbd02c56d6266179f4d136a4a862e2ec97a4a18813090960ca217885070e442bfa696a971bf0d17d10e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-synproof-doc"
RDEPENDS:${PN} += ""

inherit rpm
