SUMMARY = "Documentation for texlive-eltex"
DESCRIPTION = "This package includes the documentation for texlive-eltex"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-eltex-doc-2023.209.2.0svn15878-54.2.noarch.rpm"
RPM_HASH = "c2fad8f0e8695994d486376459e4f559e442d3920a0230cd2654125c2dce936868bc7ac3ba2eca82bd9646cea6ea107892ddaa84d0414b194000ff9a767d22ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-eltex-doc-en;cs \
texlive-eltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
