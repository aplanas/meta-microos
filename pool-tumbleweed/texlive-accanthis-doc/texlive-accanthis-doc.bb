SUMMARY = "Documentation for texlive-accanthis"
DESCRIPTION = "This package includes the documentation for texlive-accanthis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64844"

RPM_NAME = "texlive-accanthis-doc-2023.209.svn64844-55.1.noarch.rpm"
RPM_HASH = "0c5abbe001b6479d3d6fc10a6cd5a7ef78a0f2216d1d712673449bd5d1c2004fdd72e010a2784ede4dc6a8bd194015a036f2b785ed15c922596efdf834acaab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-accanthis-doc-fr \
texlive-accanthis-doc"

RDEPENDS:${PN} += ""

inherit rpm
