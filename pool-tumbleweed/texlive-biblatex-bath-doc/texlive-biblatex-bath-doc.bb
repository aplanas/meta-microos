SUMMARY = "Documentation for texlive-biblatex-bath"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bath"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0svn63401"

RPM_NAME = "texlive-biblatex-bath-doc-2023.201.6.0svn63401-53.1.noarch.rpm"
RPM_HASH = "e2e8829428fae3b70ecbe1e92c06e5d36b3fe4a5992b8533af4ee462b62277e930549549b108f0b98bd2c565eebbf61a8c8539ba1751c0b00ec2d483d71991c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bath-doc"
RDEPENDS:${PN} += ""

inherit rpm
