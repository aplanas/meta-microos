SUMMARY = "Documentation for texlive-totpages"
DESCRIPTION = "This package includes the documentation for texlive-totpages"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn15878"

RPM_NAME = "texlive-totpages-doc-2023.209.2.00svn15878-53.1.noarch.rpm"
RPM_HASH = "d9fbf605005b66beb343923b776c8bf233b0af83980e41034a637cd5c1bd06a65ee8bdfe9521739e1be658ccf4d29dca831f8d8616b701f4023bdd1c4f8c58b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-totpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
