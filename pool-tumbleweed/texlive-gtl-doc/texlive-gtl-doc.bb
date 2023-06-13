SUMMARY = "Documentation for texlive-gtl"
DESCRIPTION = "This package includes the documentation for texlive-gtl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn49527"

RPM_NAME = "texlive-gtl-doc-2023.201.0.0.5svn49527-53.1.noarch.rpm"
RPM_HASH = "754d517055d535fbdbec8d909b6e7a17c56f5291d8ce0529be26cc535290ba7053f439452701814c6cb018929b60ab75184ad6cae2975982383076700721329e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtl-doc"

RDEPENDS:${PN} += ""

inherit rpm
