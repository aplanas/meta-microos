SUMMARY = "Draw graphical elements for Feynman diagrams"
DESCRIPTION = "pst-feyn is a set of drawing graphical elements which are used \
for Feynman diagrams. The package is based on the macros of the \
old package axodraw but uses the capabilities of PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn48781"

RPM_NAME = "texlive-pst-feyn-2023.209.0.0.01svn48781-53.1.noarch.rpm"
RPM_HASH = "6e3fa296a212c4e435dc94e9c369c99a28dae9bce5832673bc800d048d3bb40ec0936ff7e0ceb0914284b18ec601273c4c4a8cb3c205fcfa6e003da31d3d5941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-feyn.sty \
tex-pst-feyn.tex \
texlive-pst-feyn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
