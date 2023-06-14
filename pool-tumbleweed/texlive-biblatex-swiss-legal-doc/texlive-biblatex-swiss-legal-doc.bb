SUMMARY = "Documentation for texlive-biblatex-swiss-legal"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-swiss-legal"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2asvn64491"

RPM_NAME = "texlive-biblatex-swiss-legal-doc-2023.201.1.1.2asvn64491-53.1.noarch.rpm"
RPM_HASH = "0e5a333047919769f948a4a18da0ffd1ab361a2b57ac0688ab7fcd29843205ff69800f7ec41b25c5c4638acf5f557e3d3dddb812cede53eb6ad4f6e0f288bbd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-swiss-legal-doc-fr \
texlive-biblatex-swiss-legal-doc"

RDEPENDS:${PN} += ""

inherit rpm
