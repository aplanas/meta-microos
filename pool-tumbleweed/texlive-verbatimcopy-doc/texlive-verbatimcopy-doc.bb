SUMMARY = "Documentation for texlive-verbatimcopy"
DESCRIPTION = "This package includes the documentation for texlive-verbatimcopy"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.06svn15878"

RPM_NAME = "texlive-verbatimcopy-doc-2023.209.0.0.06svn15878-54.1.noarch.rpm"
RPM_HASH = "bc96ec93053f8092c392ab0aff562e45cbbed1bb0130cd8f309dcc4b93f61113a5f4a4c0af6b568f355d319f1084ba03e13417ca20fe39fb3391af496dc4593e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbatimcopy-doc"

RDEPENDS:${PN} += ""

inherit rpm
