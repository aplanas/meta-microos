SUMMARY = "Documentation for texlive-regstats"
DESCRIPTION = "This package includes the documentation for texlive-regstats"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn25050"

RPM_NAME = "texlive-regstats-doc-2023.201.1.0hsvn25050-53.1.noarch.rpm"
RPM_HASH = "c2381cfdb92596dd0b0bf30b4f2f10f391fb2d510a3248da2062c69e61a18e8f83d272313b5c2ee2bf6ac14b931c5382b3ec4f8f081d0ef85117f551576bc55c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regstats-doc"

RDEPENDS:${PN} += ""

inherit rpm
