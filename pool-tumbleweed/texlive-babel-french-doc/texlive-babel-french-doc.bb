SUMMARY = "Documentation for texlive-babel-french"
DESCRIPTION = "This package includes the documentation for texlive-babel-french"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.5qsvn66513"

RPM_NAME = "texlive-babel-french-doc-2023.201.3.5qsvn66513-53.1.noarch.rpm"
RPM_HASH = "ea72dbada02047e40d9ebdd0975efc9c92af380fac54023ba51e8874e86cbcdae5ceab5373f56cf0ea6e1ae8576e2f8d89c08b1359c323bd728f3200126b1b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-babel-french-doc-fr \
texlive-babel-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
