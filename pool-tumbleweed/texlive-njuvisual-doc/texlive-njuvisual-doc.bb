SUMMARY = "Documentation for texlive-njuvisual"
DESCRIPTION = "This package includes the documentation for texlive-njuvisual"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn65261"

RPM_NAME = "texlive-njuvisual-doc-2023.209.0.0.3.0svn65261-55.1.noarch.rpm"
RPM_HASH = "3c7d7467155df0ee0eada22783b3ad3eaac1d6181ecfaeff6a3152ddb9082191c51ae19112d185973100bd3fb7822381325609d80a0bb14acd6955e5b7ffd796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-njuvisual-doc-zh \
texlive-njuvisual-doc"

RDEPENDS:${PN} += ""

inherit rpm
