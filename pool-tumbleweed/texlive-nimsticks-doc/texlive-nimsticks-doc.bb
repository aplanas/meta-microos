SUMMARY = "Documentation for texlive-nimsticks"
DESCRIPTION = "This package includes the documentation for texlive-nimsticks"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.1svn64118"

RPM_NAME = "texlive-nimsticks-doc-2023.209.2.0.1svn64118-55.1.noarch.rpm"
RPM_HASH = "98df0e8a6017f354d3460511ad3c6f57d1a23ad9fe296bb764ffbebb824b09439e4d4b1a62e12c77a3b907d721a0f21b9558d76218a192883fcad4d749048559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nimsticks-doc"

RDEPENDS:${PN} += ""

inherit rpm
