SUMMARY = "Documentation for texlive-texdate"
DESCRIPTION = "This package includes the documentation for texlive-texdate"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn49362"

RPM_NAME = "texlive-texdate-doc-2023.201.2.0svn49362-54.1.noarch.rpm"
RPM_HASH = "2b6c49ecc6420209cbd21c00e08193acaa05c2e6f603fed2c823f2868471a30c10ebbd07632c8e71439d630523007416f51e16f1c5cefa986d53eb8f62d37427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdate-doc"
RDEPENDS:${PN} += ""

inherit rpm
