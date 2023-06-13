SUMMARY = "Documentation for texlive-zwpagelayout"
DESCRIPTION = "This package includes the documentation for texlive-zwpagelayout"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4esvn63074"

RPM_NAME = "texlive-zwpagelayout-doc-2023.201.1.4esvn63074-52.1.noarch.rpm"
RPM_HASH = "fc7a5c1a8d1ea0a639dbe75f7831edd0ddd6c0854539278920a0cced12282d22a5724d27012df22c870b4c45cb6a4643f24bddde5e9fdd59968646f44c94ea30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zwpagelayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
