SUMMARY = "Documentation for texlive-bagpipe"
DESCRIPTION = "This package includes the documentation for texlive-bagpipe"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.02svn34393"

RPM_NAME = "texlive-bagpipe-doc-2023.201.3.02svn34393-53.1.noarch.rpm"
RPM_HASH = "8e8b44afbefddfaa004733e95eeb23c393c9c20d62d1a4e4563e7862109100eb7a0f33426a95ef3dea3216fd85599fd3c1e862da2a1c8d0cf89e85877398dfc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bagpipe-doc"
RDEPENDS:${PN} += ""

inherit rpm
