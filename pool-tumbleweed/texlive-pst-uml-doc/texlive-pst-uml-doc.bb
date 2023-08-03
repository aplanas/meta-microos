SUMMARY = "Documentation for texlive-pst-uml"
DESCRIPTION = "This package includes the documentation for texlive-pst-uml"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.83svn15878"

RPM_NAME = "texlive-pst-uml-doc-2023.209.0.0.83svn15878-54.1.noarch.rpm"
RPM_HASH = "8cd197199cbbc4471d60e9b490373ec039566fdf9b796d69879be1c39f965cd60b94562eaf1f2c67a02ce52055bcf676591d82ce31b4d4372d1c2c9f17c09a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-uml-doc-fr \
texlive-pst-uml-doc"

RDEPENDS:${PN} += ""

inherit rpm
