SUMMARY = "Documentation for texlive-captcont"
DESCRIPTION = "This package includes the documentation for texlive-captcont"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-captcont-doc-2023.209.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "d91ceb0e9ca9e22e23c00d191243dc4099f4af3ded690730435c9ca523c515da44bd10be2a5f85ea3418c696944d3b858142232bd83e57a049c146e410c37ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-captcont-doc"

RDEPENDS:${PN} += ""

inherit rpm
