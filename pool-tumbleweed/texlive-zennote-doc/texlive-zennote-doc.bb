SUMMARY = "Documentation for texlive-zennote"
DESCRIPTION = "This package includes the documentation for texlive-zennote"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn65549"

RPM_NAME = "texlive-zennote-doc-2023.209.1.0.0svn65549-53.2.noarch.rpm"
RPM_HASH = "8a6e0db3537e962d61153044ca6b778fd0827f4a34100aad55ffcf7b67c24ae993b12268e406ee58f885270ec8315883be260a592e6fb230e87abe3c3f7e669e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zennote-doc"

RDEPENDS:${PN} += ""

inherit rpm
