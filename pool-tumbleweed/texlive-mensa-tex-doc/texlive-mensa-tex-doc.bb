SUMMARY = "Documentation for texlive-mensa-tex"
DESCRIPTION = "This package includes the documentation for texlive-mensa-tex"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn45997"

RPM_NAME = "texlive-mensa-tex-doc-2023.208.svn45997-53.1.noarch.rpm"
RPM_HASH = "837b3bfcdcdb515850aea9ac0d4345871f479f4badf249021864a83c6b9975fffa9d765f058859ab92a0a7e6b15a013349bb41c3aa466c1806786e58f7487ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mensa-tex-doc"

RDEPENDS:${PN} += ""

inherit rpm
