SUMMARY = "Documentation for texlive-sduthesis"
DESCRIPTION = "This package includes the documentation for texlive-sduthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.1svn41401"

RPM_NAME = "texlive-sduthesis-doc-2023.209.1.2.1svn41401-54.1.noarch.rpm"
RPM_HASH = "e8e5382c5d2a1c74a2aa4fa626a8e0a541f3f07e60185ad827cb53c8f98650c74e250be28155500e92afe6883d0748c7ff3f33ae9c39db75bbe3055131ceafcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-sduthesis-doc-zh \
texlive-sduthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
