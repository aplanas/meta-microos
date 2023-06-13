SUMMARY = "Documentation for texlive-babel-esperanto"
DESCRIPTION = "This package includes the documentation for texlive-babel-esperanto"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4tsvn30265"

RPM_NAME = "texlive-babel-esperanto-doc-2023.201.1.4tsvn30265-53.1.noarch.rpm"
RPM_HASH = "cfd8f4d62d452c044a3368a7704e0ba20df33e1e653bc8caa1a0d54f3457057825c61ccc20d54ac1bc44920a11048c6086e5cc1c21416e1dc4107d441fabe358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-esperanto-doc"

RDEPENDS:${PN} += ""

inherit rpm
