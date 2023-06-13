SUMMARY = "Documentation for texlive-latex-firstaid-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-firstaid-dev"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0wsvn65181"

RPM_NAME = "texlive-latex-firstaid-dev-doc-2023.201.1.0wsvn65181-55.1.noarch.rpm"
RPM_HASH = "131071b1409f356dc874aa79c77841855051bed67f5b42c49caa4aea98ef14561e726e89b3a22b09985fd15066c618068674f83bf95f9912790d7cd2e0a5786f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-firstaid-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
