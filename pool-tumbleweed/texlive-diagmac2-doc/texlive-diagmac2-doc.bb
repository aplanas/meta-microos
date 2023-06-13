SUMMARY = "Documentation for texlive-diagmac2"
DESCRIPTION = "This package includes the documentation for texlive-diagmac2"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-diagmac2-doc-2023.201.2.1svn15878-52.1.noarch.rpm"
RPM_HASH = "88020d35b445fbfc6407fc1b9ca7fc13b00e8a5b5ec026c6e4f68cc9546d2d0763f305631858cd48925594c0101e81748b5beaf21e548dcbb632ff59cfee855d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diagmac2-doc"

RDEPENDS:${PN} += ""

inherit rpm
