SUMMARY = "Documentation for texlive-lplfitch"
DESCRIPTION = "This package includes the documentation for texlive-lplfitch"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn31077"

RPM_NAME = "texlive-lplfitch-doc-2023.201.0.0.9svn31077-54.1.noarch.rpm"
RPM_HASH = "30bb785f82e2833828ef4eb05e5b35a5920f66974357a259b3811255a24d98b1e5cc98bebea017dbe2be6616e6ff70f82bf8af2b4d2e97d284375e1652d0c225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lplfitch-doc"

RDEPENDS:${PN} += ""

inherit rpm
