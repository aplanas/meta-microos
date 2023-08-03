SUMMARY = "Documentation for texlive-bxghost"
DESCRIPTION = "This package includes the documentation for texlive-bxghost"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.1svn66147"

RPM_NAME = "texlive-bxghost-doc-2023.209.0.0.5.1svn66147-53.1.noarch.rpm"
RPM_HASH = "bafb74a726f0a85413c36f7c9c4b3f38302298aec3ebbbb88e0919ba575e05faa174de61f45479d4f7e70a33edb611f54560bfdc7d44fe59b8ca818e8a5a558a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxghost-doc"

RDEPENDS:${PN} += ""

inherit rpm
