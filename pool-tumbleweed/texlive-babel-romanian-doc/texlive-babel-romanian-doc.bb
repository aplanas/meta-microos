SUMMARY = "Documentation for texlive-babel-romanian"
DESCRIPTION = "This package includes the documentation for texlive-babel-romanian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2msvn58776"

RPM_NAME = "texlive-babel-romanian-doc-2023.209.1.2msvn58776-54.1.noarch.rpm"
RPM_HASH = "28c6bafda1bc0867da0276b219e1c7492d17e8c593e16b8c2a0141c684036b3c6810b8e33dc924d6c7ea7389e869c166c4463dd88a55fa58294d516249c8f542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-romanian-doc"

RDEPENDS:${PN} += ""

inherit rpm
