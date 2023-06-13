SUMMARY = "Documentation for texlive-binarytree"
DESCRIPTION = "This package includes the documentation for texlive-binarytree"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn41777"

RPM_NAME = "texlive-binarytree-doc-2023.201.1.01svn41777-53.1.noarch.rpm"
RPM_HASH = "15dc4dc64a270d429ee9507990d5c06eb7966c47da1223d0551eec89cb51fdbbdafd4aed18d78fd0dc8277f16f43df607d8c1043935eee457a2b4bba8c994a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-binarytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
