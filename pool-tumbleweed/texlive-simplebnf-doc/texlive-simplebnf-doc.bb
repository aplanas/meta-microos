SUMMARY = "Documentation for texlive-simplebnf"
DESCRIPTION = "This package includes the documentation for texlive-simplebnf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.2svn65485"

RPM_NAME = "texlive-simplebnf-doc-2023.201.0.0.3.2svn65485-53.1.noarch.rpm"
RPM_HASH = "1c70f1ca2750ba2eba052a5bf3b4c91499d42993f4ec613d8919240f931fee0576343ff90e00b9d7c369a083cad5100ca7df6e4bedb3425e34cfa4d747788ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplebnf-doc"

RDEPENDS:${PN} += ""

inherit rpm
