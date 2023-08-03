SUMMARY = "Documentation for texlive-xduthesis"
DESCRIPTION = "This package includes the documentation for texlive-xduthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn63116"

RPM_NAME = "texlive-xduthesis-doc-2023.209.1.00svn63116-53.1.noarch.rpm"
RPM_HASH = "400b38cd806b14a6d12a5b59c5031a2816e7cb4018f20a51af73310ed9ed60bcba75a7083a808a5affd7fd68b2886a2aa5edf2f1276abf345779ed9d59d5dc83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xduthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
