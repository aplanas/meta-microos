SUMMARY = "Documentation for texlive-biblatex-musuos"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-musuos"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24097"

RPM_NAME = "texlive-biblatex-musuos-doc-2023.209.1.0svn24097-54.1.noarch.rpm"
RPM_HASH = "62cc34b0eba5d8352be8cfecd1d252ad1cac19ed1b2b06af2819690f949e836719e9ad18231c48213acf18178bd6d3c9c1575fc5a231d9a98026e1cb21eb6a7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-musuos-doc"

RDEPENDS:${PN} += ""

inherit rpm
