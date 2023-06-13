SUMMARY = "Documentation for texlive-fixfoot"
DESCRIPTION = "This package includes the documentation for texlive-fixfoot"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn17131"

RPM_NAME = "texlive-fixfoot-doc-2023.201.0.0.3asvn17131-52.1.noarch.rpm"
RPM_HASH = "2759633b9501d2e5d97e98180786ea331941292e6fd1858f2b9a216bc901d87c1c70fd0ec9f85980e07f447647c7142ffa04ce6f24fbf1f17448bf777376d351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixfoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
