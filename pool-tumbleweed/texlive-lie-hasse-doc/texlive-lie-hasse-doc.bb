SUMMARY = "Documentation for texlive-lie-hasse"
DESCRIPTION = "This package includes the documentation for texlive-lie-hasse"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-lie-hasse-doc-2023.209.1.0svn61719-55.1.noarch.rpm"
RPM_HASH = "efd12d9c9c5c4ac91e7b5c76d7d84869de6aea08df3ed5207b60e1ba1e0c633c3f251a4c6fab8d8fe8ff563ef0874d56d9bb5ec8f9bffb3e82f7b09c5d87abd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lie-hasse-doc"

RDEPENDS:${PN} += ""

inherit rpm
