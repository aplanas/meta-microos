SUMMARY = "A BibLaTeX style emulating Springer's old spbasic.bst"
DESCRIPTION = "This package provides a bibliography and citation style for \
BibLaTeX/biber for typesetting articles for Springer's \
journals. It is the same as the old BibTeX style spbasic.bst."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.04svn61439"

RPM_NAME = "texlive-biblatex-spbasic-2023.209.0.0.04svn61439-54.1.noarch.rpm"
RPM_HASH = "134f2ddc4871c4fa4ca234b3f0ea30845a706c9348747cb189ce87a8566d4865ad9ffbe5abb9ab22e61544f6c715d65fe0585a9651c2d71e53a0c81091c878da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-spbasic.bbx \
tex-biblatex-spbasic.cbx \
tex-biblatex-spbasic.lbx \
texlive-biblatex-spbasic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-authoryear.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
