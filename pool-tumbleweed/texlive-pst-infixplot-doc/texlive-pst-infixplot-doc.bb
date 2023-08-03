SUMMARY = "Documentation for texlive-pst-infixplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-infixplot"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn15878"

RPM_NAME = "texlive-pst-infixplot-doc-2023.209.0.0.11svn15878-53.1.noarch.rpm"
RPM_HASH = "795ee88d551ec07fdd097b19bdf9a1fcd064dec34975cfe8920d4ea6c73a7995d93a695e91f2002837217f621904726cd63314fcf02743a84f35041424a33279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-infixplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
