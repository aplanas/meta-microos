SUMMARY = "Documentation for texlive-tablvar"
DESCRIPTION = "This package includes the documentation for texlive-tablvar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn51543"

RPM_NAME = "texlive-tablvar-doc-2023.201.1.2svn51543-54.1.noarch.rpm"
RPM_HASH = "01ce455ef5d48e11f07397d9ab6fba2ff2bf8ca9dcf49a4d3f261e902159ce7495fbfa080eb8f645d47bc6e63d6085c51afa4cf49ccb312b7047e30fbb553444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tablvar-doc:fr) \
texlive-tablvar-doc"

RDEPENDS:${PN} += ""

inherit rpm
