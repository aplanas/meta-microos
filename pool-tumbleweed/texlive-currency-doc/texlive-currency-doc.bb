SUMMARY = "Documentation for texlive-currency"
DESCRIPTION = "This package includes the documentation for texlive-currency"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn48990"

RPM_NAME = "texlive-currency-doc-2023.209.0.0.4svn48990-55.1.noarch.rpm"
RPM_HASH = "6896585db68b5158ac487eaa0cb39e6aa5bdc71a8185ea2bc710a442192d892249897abea340c45e4f3ecae3054a2245c514c0b285dbfda0e7f468cb287d3a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-currency-doc"

RDEPENDS:${PN} += ""

inherit rpm
