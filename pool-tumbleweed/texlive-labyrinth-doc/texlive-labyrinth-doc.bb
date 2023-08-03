SUMMARY = "Documentation for texlive-labyrinth"
DESCRIPTION = "This package includes the documentation for texlive-labyrinth"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn33454"

RPM_NAME = "texlive-labyrinth-doc-2023.209.1.0svn33454-56.1.noarch.rpm"
RPM_HASH = "97b96b33173b40d5a98278c392698bd544d558bcd57c5f08ee6570207d0004b243487209f3945efebf9b564c8698d14252c3526de8f56c2b6d88a947799d2671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labyrinth-doc"

RDEPENDS:${PN} += ""

inherit rpm
