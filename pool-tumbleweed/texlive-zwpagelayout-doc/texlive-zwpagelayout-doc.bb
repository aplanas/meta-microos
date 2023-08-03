SUMMARY = "Documentation for texlive-zwpagelayout"
DESCRIPTION = "This package includes the documentation for texlive-zwpagelayout"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4esvn63074"

RPM_NAME = "texlive-zwpagelayout-doc-2023.209.1.4esvn63074-53.1.noarch.rpm"
RPM_HASH = "2c7bb57a884ade2d7c1bcaf3f36f31f92e9f79d911c4a1938959d264cafa177166ea9a5528cff682c12971acdbff9f98d43586fbb7216681a13bada866d18825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zwpagelayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
