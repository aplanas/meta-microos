SUMMARY = "Documentation for texlive-trsym"
DESCRIPTION = "This package includes the documentation for texlive-trsym"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn18732"

RPM_NAME = "texlive-trsym-doc-2023.209.1.0svn18732-53.1.noarch.rpm"
RPM_HASH = "795c99623c4a765c28103da23197f7c7cf16313ad6cb761704d69f9297d72a88856263c6988b434db37301100c7c6155f0ef9faa45ae7daccb162ee62a12103e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
