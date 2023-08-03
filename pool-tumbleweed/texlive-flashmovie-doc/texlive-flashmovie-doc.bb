SUMMARY = "Documentation for texlive-flashmovie"
DESCRIPTION = "This package includes the documentation for texlive-flashmovie"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn25768"

RPM_NAME = "texlive-flashmovie-doc-2023.209.0.0.4svn25768-53.1.noarch.rpm"
RPM_HASH = "4def9264691c266378012b2f13ecc2c0ed73a81d365f6ca8f95df1bdf62bcec6a34913542dec82040568340b802b58ed5acdab3a9b711cb3995c6aea52c708bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flashmovie-doc"

RDEPENDS:${PN} += ""

inherit rpm
