SUMMARY = "Documentation for texlive-hep-title"
DESCRIPTION = "This package includes the documentation for texlive-hep-title"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64907"

RPM_NAME = "texlive-hep-title-doc-2023.209.1.1svn64907-54.2.noarch.rpm"
RPM_HASH = "0def2aff3a13e31c62c0b492be043429d0fbdfa2501d8c86568520bca234b6a97fecd92eb4074ce3d308377c9ebb4e7af391a6e0d738d0e5242324643f581756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-title-doc"

RDEPENDS:${PN} += ""

inherit rpm
