SUMMARY = "Documentation for texlive-ted"
DESCRIPTION = "This package includes the documentation for texlive-ted"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn15878"

RPM_NAME = "texlive-ted-doc-2023.209.1.06svn15878-55.1.noarch.rpm"
RPM_HASH = "7c7cdb5b1fc00862f1343ee74dd73513d753012b3b8492b4029a6f3892a52240dcd9b2e7dd000ca2a91c53fad13755b9d94efe57874a79a3eb879438414ea19b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ted-doc-fr \
texlive-ted-doc"

RDEPENDS:${PN} += ""

inherit rpm
