SUMMARY = "Documentation for texlive-graph35"
DESCRIPTION = "This package includes the documentation for texlive-graph35"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.3svn65138"

RPM_NAME = "texlive-graph35-doc-2023.201.0.0.1.3svn65138-53.2.noarch.rpm"
RPM_HASH = "3213da571979f4829eb28efc4e9115d38501535a0ae4bbf9938060f718386ed0b6812ffc24817025a7fe405fdcee941a5716bb6ae67345dd45e14a090cca745c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-graph35-doc-fr \
texlive-graph35-doc"

RDEPENDS:${PN} += ""

inherit rpm
