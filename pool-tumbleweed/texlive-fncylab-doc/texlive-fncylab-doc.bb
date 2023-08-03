SUMMARY = "Documentation for texlive-fncylab"
DESCRIPTION = "This package includes the documentation for texlive-fncylab"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52090"

RPM_NAME = "texlive-fncylab-doc-2023.209.1.1svn52090-53.1.noarch.rpm"
RPM_HASH = "19b79634c0e15ab7d50686b2dae46e0222318a659b40dd00b76c2c51fe0f2dbdebfd9a6af264ed42db2ec7d3f727eaa3e309b185ae5920a96d29f1d67986e043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fncylab-doc"

RDEPENDS:${PN} += ""

inherit rpm
