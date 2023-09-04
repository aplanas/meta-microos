SUMMARY = "Documentation for texlive-highlightlatex"
DESCRIPTION = "This package includes the documentation for texlive-highlightlatex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58392"

RPM_NAME = "texlive-highlightlatex-doc-2023.209.svn58392-54.2.noarch.rpm"
RPM_HASH = "9b10276c2716f008c4e21991dbbeacb3d51e25637e97f03fbd1f20dd0b0593efa487b786cd7583149ffd5642b2e76cbf6b2867861e2de43e982d017c8e1af8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-highlightlatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
