SUMMARY = "Documentation for texlive-historische-zeitschrift"
DESCRIPTION = "This package includes the documentation for texlive-historische-zeitschrift"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn42635"

RPM_NAME = "texlive-historische-zeitschrift-doc-2023.201.1.2svn42635-53.2.noarch.rpm"
RPM_HASH = "9e3368a8f20559e29c43513effa8d3ddeaa1f47696a96189eaecf5c0032d9c683ce2928d8abf86029a23b57552a7e808623c2f123905bf99623e98e5978cbda6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-historische-zeitschrift-doc-de;en \
texlive-historische-zeitschrift-doc"

RDEPENDS:${PN} += ""

inherit rpm
