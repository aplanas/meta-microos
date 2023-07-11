SUMMARY = "Documentation for texlive-yb-book"
DESCRIPTION = "This package includes the documentation for texlive-yb-book"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn64586"

RPM_NAME = "texlive-yb-book-doc-2023.201.0.0.2.0svn64586-52.2.noarch.rpm"
RPM_HASH = "546a29538c7bd361988ecccbdc63608ab2fddcf5a612ed00e6336592a2c07e8933237db622f83c1f8d06d919a34e18f2648fdc5aa0310ffc8df703bd2d2048cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yb-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
