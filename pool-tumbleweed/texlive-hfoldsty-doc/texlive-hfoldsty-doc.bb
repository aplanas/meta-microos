SUMMARY = "Documentation for texlive-hfoldsty"
DESCRIPTION = "This package includes the documentation for texlive-hfoldsty"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.15svn29349"

RPM_NAME = "texlive-hfoldsty-doc-2023.201.1.15svn29349-53.2.noarch.rpm"
RPM_HASH = "07cdad65a194cd24351ba02fa75533ac1d8085674eb675d93809cb6c8686c06f86a98798d671febce3c198c927bbccd472ce68bf2521e114451115cacb63e92c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfoldsty-doc"

RDEPENDS:${PN} += ""

inherit rpm
