SUMMARY = "Documentation for texlive-uhc"
DESCRIPTION = "This package includes the documentation for texlive-uhc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn16791"

RPM_NAME = "texlive-uhc-doc-2023.201.svn16791-53.1.noarch.rpm"
RPM_HASH = "a882ce6d6b3903519fc4b5a7740ffa820bb2d535f3922bbdd27d031958e07f12c78ecd37860f2ef0b8e4d1210cd7594622f990938eccff38b63202db70b1b860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uhc-doc"

RDEPENDS:${PN} += ""

inherit rpm
