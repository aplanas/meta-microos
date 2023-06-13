SUMMARY = "Documentation for texlive-kurier"
DESCRIPTION = "This package includes the documentation for texlive-kurier"
LICENSE = "LPPL-1.3c"

PV = "2023.201.0.0.995bsvn19612"

RPM_NAME = "texlive-kurier-doc-2023.201.0.0.995bsvn19612-55.1.noarch.rpm"
RPM_HASH = "84390f0496c12c4075e985e97982d70f5faa84646af25217fe86dff71240d85b4b8c7fd45e9f23b464fc4a6a7685507420151d76aed73c9ef5759ace17b5cfc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-kurier-doc:en;pl) \
texlive-kurier-doc"

RDEPENDS:${PN} += ""

inherit rpm
