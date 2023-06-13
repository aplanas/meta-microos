SUMMARY = "Documentation for texlive-shdoc"
DESCRIPTION = "This package includes the documentation for texlive-shdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1bsvn41991"

RPM_NAME = "texlive-shdoc-doc-2023.201.2.1bsvn41991-53.1.noarch.rpm"
RPM_HASH = "86697a578fb8447240cdce893d0403f4f1d45d96299c374cb9aa55f743b97f1d21a5fe349eabdaf36305b550215d72c2e4c83c8cc4322d966020358c044e086a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shdoc-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
