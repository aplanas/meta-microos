SUMMARY = "Documentation for texlive-spectral"
DESCRIPTION = "This package includes the documentation for texlive-spectral"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64528"

RPM_NAME = "texlive-spectral-doc-2023.209.svn64528-58.1.noarch.rpm"
RPM_HASH = "1345c15dd5d4cad518a9b7141fd4f91d72d86e3c8a0b2c83e375cc0c089bb4ca128e621c319dcf7728b663d944ffb78864d6df4e685168d3597c35f36d7a7612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spectral-doc"

RDEPENDS:${PN} += ""

inherit rpm
