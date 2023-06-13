SUMMARY = "Documentation for texlive-serbian-def-cyr"
DESCRIPTION = "This package includes the documentation for texlive-serbian-def-cyr"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23734"

RPM_NAME = "texlive-serbian-def-cyr-doc-2023.201.svn23734-53.1.noarch.rpm"
RPM_HASH = "98840dfc3e1243496100dc4e6b6495f8b5a4da41d781b9fffb8e6a7e0233f68da72e71f1442c737ee63df8fcd25ba3c3b5f4d35af58e749e05a07a016c6911bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-def-cyr-doc"

RDEPENDS:${PN} += ""

inherit rpm
