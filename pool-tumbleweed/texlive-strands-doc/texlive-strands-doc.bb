SUMMARY = "Documentation for texlive-strands"
DESCRIPTION = "This package includes the documentation for texlive-strands"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn59906"

RPM_NAME = "texlive-strands-doc-2023.201.1.1svn59906-57.1.noarch.rpm"
RPM_HASH = "2524a58f3e5c4fc6c4ceb5906ff0840bb43266eaee6529ce5570660d4446bdd21b0f98c3757b0ffec7ff04ee630f59789cd79f1f9bb3360e93bfe4b09a4e0ff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-strands-doc"

RDEPENDS:${PN} += ""

inherit rpm
