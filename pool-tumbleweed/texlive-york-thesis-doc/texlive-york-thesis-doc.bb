SUMMARY = "Documentation for texlive-york-thesis"
DESCRIPTION = "This package includes the documentation for texlive-york-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn23348"

RPM_NAME = "texlive-york-thesis-doc-2023.201.3.6svn23348-52.2.noarch.rpm"
RPM_HASH = "5c12650214ecccf0a176340ecbe7a5e5b7bf00e72c58820042d42f05c53204515feb9fd8898af28c83fda99f75a855bffeef00072e2d573360a374bb42159535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-york-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
