SUMMARY = "Documentation for texlive-plantslabels"
DESCRIPTION = "This package includes the documentation for texlive-plantslabels"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn29803"

RPM_NAME = "texlive-plantslabels-doc-2023.201.1.0svn29803-51.1.noarch.rpm"
RPM_HASH = "331a36547f511556ff1671ee01825aa68566592addad9771fd23f5782a2fad460e8be804437b5c2b2b9c8cca9d46eda154c3435456d09af5ee52322d486909e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plantslabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
