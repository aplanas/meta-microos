SUMMARY = "Documentation for texlive-gtrcrd"
DESCRIPTION = "This package includes the documentation for texlive-gtrcrd"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn32484"

RPM_NAME = "texlive-gtrcrd-doc-2023.209.1.1svn32484-54.2.noarch.rpm"
RPM_HASH = "a551b2174241219f1be37342707d3eb2aeb04e77cf396119982b2a7a86b36f946204b8bcf843a09a288086e105f85c6afdd37a38853a9daa68a68b2a0b08cb20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtrcrd-doc"

RDEPENDS:${PN} += ""

inherit rpm
