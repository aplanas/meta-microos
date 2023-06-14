SUMMARY = "Documentation for texlive-hitszbeamer"
DESCRIPTION = "This package includes the documentation for texlive-hitszbeamer"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn54381"

RPM_NAME = "texlive-hitszbeamer-doc-2023.201.1.0.0svn54381-53.1.noarch.rpm"
RPM_HASH = "f273d5550c204eff03658478f009eee30a39f40fec54f7477f1b24cb7e983a753fa699b311ca5272cdc4d282cf43053e02e1a869997e4c5a9eafd61cb816db79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitszbeamer-doc-zh \
texlive-hitszbeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
