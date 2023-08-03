SUMMARY = "Documentation for texlive-apxproof"
DESCRIPTION = "This package includes the documentation for texlive-apxproof"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.4svn64715"

RPM_NAME = "texlive-apxproof-doc-2023.209.1.2.4svn64715-55.1.noarch.rpm"
RPM_HASH = "19efb7bacf870ae82066a92a8bc99026b9ab8ae645a4c97dc6b43b59d53360e2881ccd0075a4941713f4f07f68ab660f81d74b77e1b39a1ef63323d6926c69fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apxproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
