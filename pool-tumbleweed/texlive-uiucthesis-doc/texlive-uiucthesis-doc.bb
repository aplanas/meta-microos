SUMMARY = "Documentation for texlive-uiucthesis"
DESCRIPTION = "This package includes the documentation for texlive-uiucthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.25svn15878"

RPM_NAME = "texlive-uiucthesis-doc-2023.209.2.25svn15878-54.1.noarch.rpm"
RPM_HASH = "a85096863e5b4c596f862038e4869c33b77d6caeb5d486246ab58f9c183946ce9b990e551210e6728a4d52bea540eaef7557e9872b5fb843bcf0f4e9fe82f3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uiucthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
