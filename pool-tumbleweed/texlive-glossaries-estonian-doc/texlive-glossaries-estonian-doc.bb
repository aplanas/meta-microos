SUMMARY = "Documentation for texlive-glossaries-estonian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-estonian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn49928"

RPM_NAME = "texlive-glossaries-estonian-doc-2023.201.1.0svn49928-53.1.noarch.rpm"
RPM_HASH = "f0682930b22cc087ae4781a1a6ae79cf4ac86ff4388465913963d0b824b277756fb6fafb84beddaabefb804c873ed1cea446fc42b60718427feb3f63dc427700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-estonian-doc"
RDEPENDS:${PN} += ""

inherit rpm
