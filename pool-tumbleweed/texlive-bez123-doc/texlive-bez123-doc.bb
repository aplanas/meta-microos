SUMMARY = "Documentation for texlive-bez123"
DESCRIPTION = "This package includes the documentation for texlive-bez123"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn15878"

RPM_NAME = "texlive-bez123-doc-2023.201.1.1bsvn15878-53.1.noarch.rpm"
RPM_HASH = "f30ddd0c534c944d7f5903376ef6377b9ec071a6c727eda630821fba28221db2462617b969188ee41c12948bc5f1b2727b44712eb9bbb5f6ba444d67605704bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bez123-doc"

RDEPENDS:${PN} += ""

inherit rpm
