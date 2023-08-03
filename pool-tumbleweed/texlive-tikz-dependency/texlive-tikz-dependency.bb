SUMMARY = "A library for drawing dependency graphs"
DESCRIPTION = "The package provides a library that draws together existing \
TikZ facilities to make a comfortable environment for drawing \
dependency graphs. Basic facilities of the package include a \
lot of styling facilities, to let you personalize the look and \
feel of the graphs."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54512"

RPM_NAME = "texlive-tikz-dependency-2023.209.1.2svn54512-55.1.noarch.rpm"
RPM_HASH = "52df437d9c954aa5cf1e03bb38e22e39e712668b43c5fd804ca04da94a01f451a9f4948fb1b313f5aeb3a992f8480c1552708c9030b68e1cae2b9bb1b6fb8200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfmanual.code.tex \
tex-pgfmanual.pdflinks.code.tex \
tex-pgfmanual.prettyprinter.code.tex \
tex-tikz-dependency.sty \
texlive-tikz-dependency"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
