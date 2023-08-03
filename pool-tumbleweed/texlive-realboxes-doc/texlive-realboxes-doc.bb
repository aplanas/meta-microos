SUMMARY = "Documentation for texlive-realboxes"
DESCRIPTION = "This package includes the documentation for texlive-realboxes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn64967"

RPM_NAME = "texlive-realboxes-doc-2023.209.0.0.2svn64967-54.1.noarch.rpm"
RPM_HASH = "798fe9aba6d7911ff003e84385588040663374f56773f3f584507b0e13ba60e48c78e5282a7a31536a62e863f798877fce82921471ede04282f99190879a0122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realboxes-doc"

RDEPENDS:${PN} += ""

inherit rpm
