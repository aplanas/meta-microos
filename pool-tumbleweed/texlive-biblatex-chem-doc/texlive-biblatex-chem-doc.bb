SUMMARY = "Documentation for texlive-biblatex-chem"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-chem"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1zsvn57904"

RPM_NAME = "texlive-biblatex-chem-doc-2023.209.1.1zsvn57904-54.1.noarch.rpm"
RPM_HASH = "a3c77b1584533b71d409c32f88522ab6c1b44cd368b3eb1126ecf4e594a8b139cc1e10604baad92d66fdebe2e4d327f747c93c49d09738a87a6fe91ea66293e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-chem-doc"

RDEPENDS:${PN} += ""

inherit rpm
