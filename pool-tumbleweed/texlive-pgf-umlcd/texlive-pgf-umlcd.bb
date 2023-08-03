SUMMARY = "Some LaTeX macros for UML Class Diagrams"
DESCRIPTION = "Some LaTeX macros for UML Class Diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3svn63386"

RPM_NAME = "texlive-pgf-umlcd-2023.209.0.0.3svn63386-52.1.noarch.rpm"
RPM_HASH = "c9a70bc5f800bc58c787f6838fd5afc6d3f1bd55f51d066658ac1cc9c4d39ac1f996a939846d38d93c260ce8362b6de5ddd5d56c7db7f1e6459b834bd3edca1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-umlcd.sty \
tex-tikzlibraryumlcd.code.tex \
texlive-pgf-umlcd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
