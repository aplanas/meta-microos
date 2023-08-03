SUMMARY = "Documentation for texlive-komacv-rg"
DESCRIPTION = "This package includes the documentation for texlive-komacv-rg"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.2svn49064"

RPM_NAME = "texlive-komacv-rg-doc-2023.209.0.0.9.2svn49064-56.1.noarch.rpm"
RPM_HASH = "73c0765fe99170c7874f28750521a2dfde64a37388516d45df6ebe470bf8d72cee1e85d2dd7b0901fe35f71006d37ec9569cb61b88f55d978bc64e665fc0ee0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-komacv-rg-doc"

RDEPENDS:${PN} += ""

inherit rpm
