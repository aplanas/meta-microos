SUMMARY = "Documentation for texlive-gotoh"
DESCRIPTION = "This package includes the documentation for texlive-gotoh"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44764"

RPM_NAME = "texlive-gotoh-doc-2023.209.1.1svn44764-54.2.noarch.rpm"
RPM_HASH = "d2561037f61e596cb104266832a284a4bfe45fdd6a5fc9c4ed0aa49ce7938dbea6afe107b3ef6b45e592f918fa80a02b6128dd0ad082c2d746344717ee1ed384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gotoh-doc"

RDEPENDS:${PN} += ""

inherit rpm
