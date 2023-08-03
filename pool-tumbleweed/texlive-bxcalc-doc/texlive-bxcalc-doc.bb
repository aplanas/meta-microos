SUMMARY = "Documentation for texlive-bxcalc"
DESCRIPTION = "This package includes the documentation for texlive-bxcalc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56431"

RPM_NAME = "texlive-bxcalc-doc-2023.209.1.1svn56431-53.1.noarch.rpm"
RPM_HASH = "4073f924ab62d0297c360222fe0553707e32a29ad4c0af37f5d273fb8c382d6d71de7e8adaf8be82c3aed304d2de2a1e57aa48232d1f5ebfabb3c8d40522435d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
