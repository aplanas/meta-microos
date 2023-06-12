SUMMARY = "Documentation for texlive-tkz-fct"
DESCRIPTION = "This package includes the documentation for texlive-tkz-fct"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7csvn61949"

RPM_NAME = "texlive-tkz-fct-doc-2023.201.1.7csvn61949-52.1.noarch.rpm"
RPM_HASH = "926761c4e467ff6bde0bc55096f79e1681213c5fda0f735d811bd6cae6984f0e6d53ef8ba0ce136969b09b93e537bb9fe51877e3228e548cccec5c883761b5ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tkz-fct-doc:fr) \
texlive-tkz-fct-doc"
RDEPENDS:${PN} += ""

inherit rpm
