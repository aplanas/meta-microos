SUMMARY = "Documentation for texlive-ecobiblatex"
DESCRIPTION = "This package includes the documentation for texlive-ecobiblatex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39233"

RPM_NAME = "texlive-ecobiblatex-doc-2023.209.1.0svn39233-54.1.noarch.rpm"
RPM_HASH = "e9b135f6f82d613c28e386e10e2711644fb87e00b644417af27a698363ae5d65192282be2d233fc813cd3c6dde8cfb16c9439a3a85033c8bd60738c3b1605006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecobiblatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
