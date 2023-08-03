SUMMARY = "Documentation for texlive-hobsub"
DESCRIPTION = "This package includes the documentation for texlive-hobsub"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn52810"

RPM_NAME = "texlive-hobsub-doc-2023.209.svn52810-54.1.noarch.rpm"
RPM_HASH = "9d4b7af4f00db465c91583932edf80376c6a84a4c01363696fb21e1ea8857c04b7daab2bcce5dd94ca5d48c8c02e5f0bdd50de9b991590ef51d7a91758a9de15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hobsub-doc"

RDEPENDS:${PN} += ""

inherit rpm
