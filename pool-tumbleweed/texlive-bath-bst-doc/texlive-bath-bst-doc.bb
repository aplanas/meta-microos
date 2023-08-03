SUMMARY = "Documentation for texlive-bath-bst"
DESCRIPTION = "This package includes the documentation for texlive-bath-bst"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0svn63398"

RPM_NAME = "texlive-bath-bst-doc-2023.209.6.0svn63398-54.1.noarch.rpm"
RPM_HASH = "d79887112feb82c90cf299d2603ab1ddbcc4837526acecf2040241a7ae50002538e1a4e765c554c4f9a444bcf0b1d582e268ca8c8540e60bae1bac3a91e1ffcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bath-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
