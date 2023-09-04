SUMMARY = "Documentation for texlive-ebgaramond-maths"
DESCRIPTION = "This package includes the documentation for texlive-ebgaramond-maths"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn52168"

RPM_NAME = "texlive-ebgaramond-maths-doc-2023.209.1.2svn52168-54.2.noarch.rpm"
RPM_HASH = "dfc499a8a4a42016dfa55f551c023be9d8f674558fc226c6460ab74d1560abeb6b1614313f96d286e6f1cc7a3f1a2fd98ac2a87757f3eb7112a8fbda3b3dfac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebgaramond-maths-doc"

RDEPENDS:${PN} += ""

inherit rpm
