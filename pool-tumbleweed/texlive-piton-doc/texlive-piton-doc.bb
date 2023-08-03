SUMMARY = "Documentation for texlive-piton"
DESCRIPTION = "This package includes the documentation for texlive-piton"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65835"

RPM_NAME = "texlive-piton-doc-2023.209.1.4svn65835-52.1.noarch.rpm"
RPM_HASH = "7d1f79554a69c6c3986228516e9bc72d0d74b3e0c18c1febba62e099fc28762f0c78e189b93c4f886dc1a6dbf2eb7575fb7ae4f0d948e7625a8317055b501ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-piton-doc-fr \
texlive-piton-doc"

RDEPENDS:${PN} += ""

inherit rpm
