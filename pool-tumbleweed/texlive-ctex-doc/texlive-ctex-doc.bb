SUMMARY = "Documentation for texlive-ctex"
DESCRIPTION = "This package includes the documentation for texlive-ctex"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.5.10svn66115"

RPM_NAME = "texlive-ctex-doc-2023.204.2.5.10svn66115-54.1.noarch.rpm"
RPM_HASH = "89bf659db6831e8ce3532d77f06ebf277511bd6602538e46a00de437b77fbedba718820baa3b1455fb4559e7a300fc65e160252b8f9a9e3c8b6b4bdfc5301779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ctex-doc-zh \
texlive-ctex-doc"

RDEPENDS:${PN} += ""

inherit rpm
