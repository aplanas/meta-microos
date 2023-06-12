SUMMARY = "Documentation for texlive-luagcd"
DESCRIPTION = "This package includes the documentation for texlive-luagcd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65396"

RPM_NAME = "texlive-luagcd-doc-2023.201.1.0svn65396-52.1.noarch.rpm"
RPM_HASH = "29d20fee7dec5b965c4651502902dcd5068c9c3873bbf1596bb092edcd595a5390fad204d2bbdcca5f718b7b9b12c5e3de28e1b4e5baf4202ded378f50acb15d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luagcd-doc"
RDEPENDS:${PN} += ""

inherit rpm
