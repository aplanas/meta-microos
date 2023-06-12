SUMMARY = "Documentation for texlive-glossaries-german"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-german"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-german-doc-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "91ad530ca827df99294667d909f4001e56a12263341a2746aa9e20d13bc3f0f22bce41e1e037c2a19fce6af400b1ce43d0bf1e4f034bbadff149a7769de17a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-german-doc"
RDEPENDS:${PN} += ""

inherit rpm
