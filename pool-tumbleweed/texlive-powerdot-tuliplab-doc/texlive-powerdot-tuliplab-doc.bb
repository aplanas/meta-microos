SUMMARY = "Documentation for texlive-powerdot-tuliplab"
DESCRIPTION = "This package includes the documentation for texlive-powerdot-tuliplab"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn47963"

RPM_NAME = "texlive-powerdot-tuliplab-doc-2023.201.1.0.0svn47963-52.1.noarch.rpm"
RPM_HASH = "4ac884f433953bb880450d3d9b24b270782ea9ac779e69df3578f428a8c9158da24c7b2fd956f361dbb845a465763b94fcd199561865ea82e3f5eb6fc910045c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-powerdot-tuliplab-doc"
RDEPENDS:${PN} += ""

inherit rpm
