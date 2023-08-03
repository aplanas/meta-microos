SUMMARY = "Documentation for texlive-nonfloat"
DESCRIPTION = "This package includes the documentation for texlive-nonfloat"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn17598"

RPM_NAME = "texlive-nonfloat-doc-2023.209.1.0svn17598-55.1.noarch.rpm"
RPM_HASH = "3dbba073c2a97a049aa0d4d30a9df204cd199ae3d5201608fa857358bf2d0b0d8d83bfae18737a65e07630854fd3144e22d1023bdd4a4b8486a913f6cef245bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nonfloat-doc-en;de \
texlive-nonfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
