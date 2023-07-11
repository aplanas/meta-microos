SUMMARY = "Documentation for texlive-glossaries-magyar"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-magyar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-magyar-doc-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "b94b83c1101ae31fdf50fe8768ae45b315e52f75fda305996dbb0e46c8b24485991d4eb67078204b096b549214d3c9c7dfc5cb47c0b6982878e97a7ccfa6cbec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-magyar-doc"

RDEPENDS:${PN} += ""

inherit rpm
