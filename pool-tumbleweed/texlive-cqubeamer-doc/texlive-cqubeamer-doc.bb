SUMMARY = "Documentation for texlive-cqubeamer"
DESCRIPTION = "This package includes the documentation for texlive-cqubeamer"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54512"

RPM_NAME = "texlive-cqubeamer-doc-2023.209.1.0svn54512-55.1.noarch.rpm"
RPM_HASH = "5bff24f77ffc108a7f438e27c5b8d821ecd7825f7792f921a24962d608b5ba8079059925cc8f53e62dd1aa205e0abd11fe347946284959474bf60c823eb41346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cqubeamer-doc-zh \
texlive-cqubeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
