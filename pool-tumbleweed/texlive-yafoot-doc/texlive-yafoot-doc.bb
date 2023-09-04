SUMMARY = "Documentation for texlive-yafoot"
DESCRIPTION = "This package includes the documentation for texlive-yafoot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48568"

RPM_NAME = "texlive-yafoot-doc-2023.209.1.1svn48568-53.2.noarch.rpm"
RPM_HASH = "04e14740ef959c7a6e681a739ac67bda6216814404dbf38bd55764cbc82c35d7401d0cde15635d3d1ff68a4d7351a715990a345d37d442e86ee19839b2e66fc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yafoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
