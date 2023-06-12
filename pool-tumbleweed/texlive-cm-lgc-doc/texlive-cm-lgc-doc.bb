SUMMARY = "Documentation for texlive-cm-lgc"
DESCRIPTION = "This package includes the documentation for texlive-cm-lgc"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5svn28250"

RPM_NAME = "texlive-cm-lgc-doc-2023.201.0.0.5svn28250-53.1.noarch.rpm"
RPM_HASH = "d5c0a185f4dc0ece5416e982da4fc662c6fda7b8b951e6ec40a4ab9cf841771bd18b9ba40d66241fada25c95cbd53658ffd87ea3162774ff7eb19603d6bc4f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-lgc-doc"
RDEPENDS:${PN} += ""

inherit rpm
