SUMMARY = "Documentation for texlive-imsproc"
DESCRIPTION = "This package includes the documentation for texlive-imsproc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29803"

RPM_NAME = "texlive-imsproc-doc-2023.201.0.0.1svn29803-52.1.noarch.rpm"
RPM_HASH = "65526abaebc9a6f48534e98b10cb4a63be9904e87fe8a9769a8ec448eb369559a3a39c02bf3f523f34ea1c23f41f6f0fa5bbc01aafcdcf8754810a950d041f2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imsproc-doc"

RDEPENDS:${PN} += ""

inherit rpm
