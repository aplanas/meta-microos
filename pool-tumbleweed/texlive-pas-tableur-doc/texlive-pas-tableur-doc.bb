SUMMARY = "Documentation for texlive-pas-tableur"
DESCRIPTION = "This package includes the documentation for texlive-pas-tableur"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01svn39542"

RPM_NAME = "texlive-pas-tableur-doc-2023.201.2.01svn39542-51.1.noarch.rpm"
RPM_HASH = "2ff330a17208f187e2a10cae8f97a5cb9add56f67985b2aeddedc66ab2ccf04ead056ccfc0f6d84e919d6b01b8cf2b8bdc7795ac1f585c67a098c29fa50959f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pas-tableur-doc"

RDEPENDS:${PN} += ""

inherit rpm
