SUMMARY = "Documentation for texlive-classicthesis"
DESCRIPTION = "This package includes the documentation for texlive-classicthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.6svn48041"

RPM_NAME = "texlive-classicthesis-doc-2023.201.4.6svn48041-53.1.noarch.rpm"
RPM_HASH = "c4fc17ba5936ab00626b72c824d54b1d90d044a798a8313a78d06e29f8c5a2cdf74b1a01d9b59abfaa42f3bec0bed2855b022e4ca417d1622befe6afcdb79059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-classicthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
