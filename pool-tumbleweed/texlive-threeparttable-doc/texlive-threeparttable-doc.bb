SUMMARY = "Documentation for texlive-threeparttable"
DESCRIPTION = "This package includes the documentation for texlive-threeparttable"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17383"

RPM_NAME = "texlive-threeparttable-doc-2023.209.svn17383-55.1.noarch.rpm"
RPM_HASH = "dbf2ed603ba7fb28a03490fc261a3a28e92c992a4fba0fc1a2e24f3155f8e9f3c72a9ef6703642cf898b2a2695e3b6cb79e2afd3d35d1c6846f7f1c516473633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeparttable-doc"

RDEPENDS:${PN} += ""

inherit rpm
