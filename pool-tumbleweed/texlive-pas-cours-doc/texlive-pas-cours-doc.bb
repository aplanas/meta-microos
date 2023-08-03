SUMMARY = "Documentation for texlive-pas-cours"
DESCRIPTION = "This package includes the documentation for texlive-pas-cours"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn55859"

RPM_NAME = "texlive-pas-cours-doc-2023.209.1.9svn55859-52.1.noarch.rpm"
RPM_HASH = "978e6bae59fa37aa6b6499537b961dd382d9c7d41164cf866a4fb753b5cb6a0f30eaea24c9b84c2368ea01559315f9eb46b5bbed8f4b36e88c53190b0f644bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pas-cours-doc"

RDEPENDS:${PN} += ""

inherit rpm
