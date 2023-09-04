SUMMARY = "Documentation for texlive-pst-spinner"
DESCRIPTION = "This package includes the documentation for texlive-pst-spinner"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn66115"

RPM_NAME = "texlive-pst-spinner-doc-2023.209.1.02svn66115-54.2.noarch.rpm"
RPM_HASH = "8e047e18597d7d7a6a1fbbe26c30413bc507beb08b1a45a87f7dd865aff35c53e430ca744764466ffff332ac1821c16b5e5ae97dcaea9511b1741c070bae00de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-spinner-doc"

RDEPENDS:${PN} += ""

inherit rpm
