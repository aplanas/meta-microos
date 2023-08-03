SUMMARY = "Documentation for texlive-ecgdraw"
DESCRIPTION = "This package includes the documentation for texlive-ecgdraw"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn41617"

RPM_NAME = "texlive-ecgdraw-doc-2023.209.0.0.1svn41617-54.1.noarch.rpm"
RPM_HASH = "d2c3bdfeefa347dc5b4414747466acb122812923bcb1b5c5a349b95290a11da8b43af61ef68dcc3cf6c7520407446eff1c46c1fe424c683112ed41c5f043445c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ecgdraw-doc-it \
texlive-ecgdraw-doc"

RDEPENDS:${PN} += ""

inherit rpm
