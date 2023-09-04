SUMMARY = "Documentation for texlive-pst-perspective"
DESCRIPTION = "This package includes the documentation for texlive-pst-perspective"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn39585"

RPM_NAME = "texlive-pst-perspective-doc-2023.209.1.05svn39585-54.2.noarch.rpm"
RPM_HASH = "0b381e216aa78681276f1448039a88e86e6381a08e49b7e3e9efcae39f54a28529aa8f3d5ca336f3d7b92d47d593ca0bd0559578b6225ea4d4784e33dd93dca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-perspective-doc-de;en \
texlive-pst-perspective-doc"

RDEPENDS:${PN} += ""

inherit rpm
