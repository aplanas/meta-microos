SUMMARY = "Documentation for texlive-biblatex-license"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-license"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn58437"

RPM_NAME = "texlive-biblatex-license-doc-2023.201.0.0.1svn58437-53.1.noarch.rpm"
RPM_HASH = "67e7770299f963c511bf3f1a04b932081565b576ec1dce78eeb6020c9aff5e0c1145175e73b08a3b43beede49cc691e08b9eb23855cf9e424dfa6e49dcae7ab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-license-doc"

RDEPENDS:${PN} += ""

inherit rpm
