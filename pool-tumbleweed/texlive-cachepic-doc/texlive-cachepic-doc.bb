SUMMARY = "Documentation for texlive-cachepic"
DESCRIPTION = "This package includes the documentation for texlive-cachepic"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn26313"

RPM_NAME = "texlive-cachepic-doc-2023.209.1.0svn26313-53.1.noarch.rpm"
RPM_HASH = "77c2ff7ee33e220ec24294fc8757174183bb632e9103a9217bff117ed89b892463a7acf3885ef476f5c5b05829b0bafac5c045fc242136a2149d68428f2c7bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cachepic-doc"

RDEPENDS:${PN} += ""

inherit rpm
