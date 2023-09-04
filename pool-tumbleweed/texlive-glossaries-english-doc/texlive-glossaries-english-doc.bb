SUMMARY = "Documentation for texlive-glossaries-english"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-english"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-english-doc-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "ef426c10a252a25868e8f837a405ee672d75f9fc4688e01680736b85d30d6a0be7dd274ea20d8f149fa0acbbd305c4b1852e8e66d4711659c34666d2a87ee4ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-english-doc"

RDEPENDS:${PN} += ""

inherit rpm
