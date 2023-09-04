SUMMARY = "Documentation for texlive-glossaries-danish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-danish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-danish-doc-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "e0ad778b6540594cf3dc6ac89327bcc6fbb57a8e915f002b7fc160b4c57aa5d9fdbe0cc609a30ece25337ef1b2bfd30d932b8014148a89734782b4e960e6a767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-danish-doc"

RDEPENDS:${PN} += ""

inherit rpm
