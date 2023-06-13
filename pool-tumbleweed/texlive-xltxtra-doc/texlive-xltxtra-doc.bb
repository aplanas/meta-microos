SUMMARY = "Documentation for texlive-xltxtra"
DESCRIPTION = "This package includes the documentation for texlive-xltxtra"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn56594"

RPM_NAME = "texlive-xltxtra-doc-2023.201.0.0.7svn56594-52.1.noarch.rpm"
RPM_HASH = "3545fa077c46628e011d40049d5c6ee7694a6718ef9cd097e6454ce4498730149918c2ac8b7e20e5b01326f8a64e0353b641f0fcfa674128c72fea9eb81df55c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xltxtra-doc"

RDEPENDS:${PN} += ""

inherit rpm
