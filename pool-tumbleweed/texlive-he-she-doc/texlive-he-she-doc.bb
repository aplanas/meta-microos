SUMMARY = "Documentation for texlive-he-she"
DESCRIPTION = "This package includes the documentation for texlive-he-she"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn41359"

RPM_NAME = "texlive-he-she-doc-2023.201.1.3svn41359-53.2.noarch.rpm"
RPM_HASH = "c7509fecbefb2a125ece951ab5d4ba63ae82b14aca5600c04074bee15ac17e9f998c19842ebf9ce0e7ba39d26b60fca450d1315aa906d1a395c31915d06818bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-he-she-doc"

RDEPENDS:${PN} += ""

inherit rpm
