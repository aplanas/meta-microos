SUMMARY = "Documentation for texlive-spbmark"
DESCRIPTION = "This package includes the documentation for texlive-spbmark"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.42svn64706"

RPM_NAME = "texlive-spbmark-doc-2023.209.1.42svn64706-58.1.noarch.rpm"
RPM_HASH = "8353b180bca73a128dd80889315e95eb91044406ff024a2a8ee03caa68df0161eb9747f5d524e0c0b4c298061acc6c04dd7f7a6c8383d59c23826f9febab3c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spbmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
