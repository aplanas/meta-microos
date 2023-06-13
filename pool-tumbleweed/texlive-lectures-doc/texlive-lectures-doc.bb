SUMMARY = "Documentation for texlive-lectures"
DESCRIPTION = "This package includes the documentation for texlive-lectures"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.5svn53642"

RPM_NAME = "texlive-lectures-doc-2023.201.1.0.5svn53642-54.1.noarch.rpm"
RPM_HASH = "ebbc4e0559c0984a71c78cd716a29fe506357a692a553aaec1e21d0e4427819d3701c9bffb00b172babc0b3c9a33d933f7533d96e1bf56c1e22e79558c786b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lectures-doc"

RDEPENDS:${PN} += ""

inherit rpm
