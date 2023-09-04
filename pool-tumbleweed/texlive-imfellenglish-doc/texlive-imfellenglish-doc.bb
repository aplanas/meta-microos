SUMMARY = "Documentation for texlive-imfellenglish"
DESCRIPTION = "This package includes the documentation for texlive-imfellenglish"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64568"

RPM_NAME = "texlive-imfellenglish-doc-2023.209.svn64568-54.1.noarch.rpm"
RPM_HASH = "6e8408011a54d4f7786c02fd476ead6ede8859e9eb72c57547309a5864c505d242e28e7f4a4ba39a9dbb9a91ba562f0a5d50f82d6c1ca1863f0d0a3ab35fe986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imfellenglish-doc"

RDEPENDS:${PN} += ""

inherit rpm
