SUMMARY = "Documentation for texlive-phfsvnwatermark"
DESCRIPTION = "This package includes the documentation for texlive-phfsvnwatermark"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn41870"

RPM_NAME = "texlive-phfsvnwatermark-doc-2023.209.1.0svn41870-52.1.noarch.rpm"
RPM_HASH = "60b36608623d0186dd18a5435e19a418490b553c6209d987bd6b68e403d3c99c75069830952aaa74f63c991fa141077119dc897452f857df4790bb19fc22f37c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfsvnwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
