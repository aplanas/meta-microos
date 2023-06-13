SUMMARY = "Documentation for texlive-biblatex-socialscienceshuberlin"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-socialscienceshuberlin"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1svn47839"

RPM_NAME = "texlive-biblatex-socialscienceshuberlin-doc-2023.201.0.0.0.1svn47839-53.1.noarch.rpm"
RPM_HASH = "f370cd3fe81e6a30a02258dbd618056bbf9ea28696d28e030f032334ba0188a41c7ca19d566d818a0d572f10f4dc5791887f27ad62f104e02b93b1e0bb9c22f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-socialscienceshuberlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
