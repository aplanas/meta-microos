SUMMARY = "Documentation for texlive-cjkutils"
DESCRIPTION = "This package includes the documentation for texlive-cjkutils"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.8.5svn60833"

RPM_NAME = "texlive-cjkutils-doc-2023.209.4.8.5svn60833-54.1.noarch.rpm"
RPM_HASH = "e265410b7a401f84439e741d29beccbd372cb654d629a4a840f14f9e5ded8695d13a151068737966db4e3dfed2e8c92f75a6fb664a39e50de2e7cc69aee67030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bg5conv.1 \
man-cef5conv.1 \
man-cefconv.1 \
man-cefsconv.1 \
man-extconv.1 \
man-hbf2gf.1 \
man-sjisconv.1 \
texlive-cjkutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
