SUMMARY = "Documentation for texlive-biolett-bst"
DESCRIPTION = "This package includes the documentation for texlive-biolett-bst"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66115"

RPM_NAME = "texlive-biolett-bst-doc-2023.201.svn66115-52.1.noarch.rpm"
RPM_HASH = "9fdf2f8a6a118c572e1b171b54cec92df7eb175054290a21dee9d59f92c10c4df93dc35f5eefbdf18a45f240deaa3be4c5ee3b9fbdef96fce2225e14938fa8d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biolett-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
