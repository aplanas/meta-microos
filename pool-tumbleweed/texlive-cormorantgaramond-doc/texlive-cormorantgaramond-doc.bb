SUMMARY = "Documentation for texlive-cormorantgaramond"
DESCRIPTION = "This package includes the documentation for texlive-cormorantgaramond"
LICENSE = "OFL-1.1"

PV = "2023.204.3.601svn64411"

RPM_NAME = "texlive-cormorantgaramond-doc-2023.204.3.601svn64411-54.1.noarch.rpm"
RPM_HASH = "1b5974bf7fcf4e86895cc1286b971a59c4add84149bcc34d0b598a720304d015324433c40801b227932982c600a86b51c194203d7483c881fb92a91d386cebad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cormorantgaramond-doc"

RDEPENDS:${PN} += ""

inherit rpm
