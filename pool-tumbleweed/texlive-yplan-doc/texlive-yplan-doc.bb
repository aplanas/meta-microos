SUMMARY = "Documentation for texlive-yplan"
DESCRIPTION = "This package includes the documentation for texlive-yplan"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn34398"

RPM_NAME = "texlive-yplan-doc-2023.201.svn34398-52.1.noarch.rpm"
RPM_HASH = "5acefb80db687882b17faeee53d32fa64b467d9d02e1b9d96b7cc9f2819576198e0c21ee68bd72d966ce2d21cf8c6d2787eae1a452fc4557d241bb68f1f860f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yplan-doc"
RDEPENDS:${PN} += ""

inherit rpm
