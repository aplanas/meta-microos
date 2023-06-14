SUMMARY = "Documentation for texlive-yathesis"
DESCRIPTION = "This package includes the documentation for texlive-yathesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.11svn66146"

RPM_NAME = "texlive-yathesis-doc-2023.201.1.0.11svn66146-52.1.noarch.rpm"
RPM_HASH = "5ee65a94f57c629553723c240dd1ca597ff8f27439d09f5b2b7d32dea9c754579771b230f39e2e89e8dc24242ebb393e842ecfff1419ba4ae97d59c53d2bdd5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yathesis-doc-fr \
texlive-yathesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
