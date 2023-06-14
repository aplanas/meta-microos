SUMMARY = "Documentation for texlive-jpnedumathsymbols"
DESCRIPTION = "This package includes the documentation for texlive-jpnedumathsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63864"

RPM_NAME = "texlive-jpnedumathsymbols-doc-2023.201.1.1svn63864-55.1.noarch.rpm"
RPM_HASH = "a38f3957c994d5a6a7848dea34dedce79d990fec317a1457d89f4254049298c8e3addee62d96e1bad5eeb045ab96fa0a429ba16532e8cf1155dfcca0ff23eaff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-jpnedumathsymbols-doc-en \
texlive-jpnedumathsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
