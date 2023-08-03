SUMMARY = "Documentation for texlive-musixguit"
DESCRIPTION = "This package includes the documentation for texlive-musixguit"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn21649"

RPM_NAME = "texlive-musixguit-doc-2023.209.1.2.2svn21649-55.1.noarch.rpm"
RPM_HASH = "f54079d8a6e8530f8b0ad474036014877e8bd4622b9e5571a82b03164997032b3d210a6fb88f0d1a7ff40deee23bbad17b00a68a04349d230f56ca1fed53b7bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-musixguit-doc-de \
texlive-musixguit-doc"

RDEPENDS:${PN} += ""

inherit rpm
