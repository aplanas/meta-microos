SUMMARY = "Documentation for texlive-encxvlna"
DESCRIPTION = "This package includes the documentation for texlive-encxvlna"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn34087"

RPM_NAME = "texlive-encxvlna-doc-2023.201.1.1svn34087-53.2.noarch.rpm"
RPM_HASH = "7cb9a274668d66e9fd63e515aa5597dbf04626e281e9460b75642b4849cdd7bb3a9e70d1e928495ebc25b6411911e3c9200d376e3a0898f1083fc4b3b4b500cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-encxvlna-doc"

RDEPENDS:${PN} += ""

inherit rpm
