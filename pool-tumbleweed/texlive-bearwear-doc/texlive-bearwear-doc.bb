SUMMARY = "Documentation for texlive-bearwear"
DESCRIPTION = "This package includes the documentation for texlive-bearwear"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn54826"

RPM_NAME = "texlive-bearwear-doc-2023.209.0.0.2svn54826-54.1.noarch.rpm"
RPM_HASH = "4a5293c4923c4a042397c7ae2ac9bc1cba401731b789afc90a9527ac3e551d70bd6f3bb8f8067b1ed716bb3c171f3ac016d0438bbbc00358c9c667fc2ab3c0ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bearwear-doc"

RDEPENDS:${PN} += ""

inherit rpm
