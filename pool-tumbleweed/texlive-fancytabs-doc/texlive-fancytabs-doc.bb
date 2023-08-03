SUMMARY = "Documentation for texlive-fancytabs"
DESCRIPTION = "This package includes the documentation for texlive-fancytabs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn41549"

RPM_NAME = "texlive-fancytabs-doc-2023.209.1.9svn41549-53.1.noarch.rpm"
RPM_HASH = "bd10126c7857e0ca0b8797006810cd63a6f0e9c189c71c20b3ddaf32e2df69feeb72e638bb242c5d6686b7d23753d8326a7f9aa4c2ca58db50db27d62c67e3d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancytabs-doc"

RDEPENDS:${PN} += ""

inherit rpm
