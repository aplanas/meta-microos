SUMMARY = "Documentation for texlive-jumplines"
DESCRIPTION = "This package includes the documentation for texlive-jumplines"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn37553"

RPM_NAME = "texlive-jumplines-doc-2023.209.0.0.2svn37553-56.1.noarch.rpm"
RPM_HASH = "f8b1d29e25ac306f0836c9c17d84d1aa95f24341692b060ed8cecf47b29f820b1aeabf8e963773b56769b818900c17dd355294bce6b8c89b758b39c057bd95ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jumplines-doc"

RDEPENDS:${PN} += ""

inherit rpm
