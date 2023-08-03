SUMMARY = "Documentation for texlive-namedtensor"
DESCRIPTION = "This package includes the documentation for texlive-namedtensor"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn65346"

RPM_NAME = "texlive-namedtensor-doc-2023.209.0.0.4svn65346-55.1.noarch.rpm"
RPM_HASH = "3dc4240455259eadf01d352ec12a006a610946f298212059060b7ed2397e559576020d81265ab920764d970ab229bffec36fb96e23cc876debac1236cd67bba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-namedtensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
