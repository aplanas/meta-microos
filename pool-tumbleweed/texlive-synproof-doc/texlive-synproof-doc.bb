SUMMARY = "Documentation for texlive-synproof"
DESCRIPTION = "This package includes the documentation for texlive-synproof"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-synproof-doc-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "39d39e12fc441c4c62762625ba67bfabaf2a92a61d7aa39c25fea08214f8e52a9e0023720be5c5498ebaf915f4b7125177c7db3aa6bc5ce67a4648dd064c75b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-synproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
