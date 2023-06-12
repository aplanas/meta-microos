SUMMARY = "Documentation for texlive-cachepic"
DESCRIPTION = "This package includes the documentation for texlive-cachepic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn26313"

RPM_NAME = "texlive-cachepic-doc-2023.201.1.0svn26313-52.1.noarch.rpm"
RPM_HASH = "e22cdb9aede5cb97ab216fb5f3a4fc488be19b09b44013dfc7a7acab77aba95f2d94feddab2156d121b2db846ec64a468ca5f245c06f1890f5d278e4ffa8b455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cachepic-doc"
RDEPENDS:${PN} += ""

inherit rpm
