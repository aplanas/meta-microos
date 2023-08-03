SUMMARY = "Documentation for texlive-semantic-markup"
DESCRIPTION = "This package includes the documentation for texlive-semantic-markup"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53607"

RPM_NAME = "texlive-semantic-markup-doc-2023.209.svn53607-54.1.noarch.rpm"
RPM_HASH = "1a78290b02bc085c1e8bfca05d28acecb9070844a2b71d2e91e346585b3fd94091643b387e620964973cf40ec1badc150621329b5accc890c2f566c4a668e9a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semantic-markup-doc"

RDEPENDS:${PN} += ""

inherit rpm
