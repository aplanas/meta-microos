SUMMARY = "Documentation for texlive-mandi"
DESCRIPTION = "This package includes the documentation for texlive-mandi"
LICENSE = "LPPL-1.0"

PV = "2023.208.3.1.0svn61764"

RPM_NAME = "texlive-mandi-doc-2023.208.3.1.0svn61764-53.1.noarch.rpm"
RPM_HASH = "4b8d49fb6731d8a39a97a5023027f04625bb5523b7bf5c85d780b3d5fdd2de6e68d4725ee898a7d763a5627ddef8816b0e10ec3554f2ef8037317068b0a42211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mandi-doc"

RDEPENDS:${PN} += ""

inherit rpm
