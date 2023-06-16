SUMMARY = "A library for drawing dependency graphs"
DESCRIPTION = "The package provides a library that draws together existing \
TikZ facilities to make a comfortable environment for drawing \
dependency graphs. Basic facilities of the package include a \
lot of styling facilities, to let you personalize the look and \
feel of the graphs."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn54512"

RPM_NAME = "texlive-tikz-dependency-2023.201.1.2svn54512-54.1.noarch.rpm"
RPM_HASH = "3be89f45546bf6e40f0e1508ef34d144370c99210ce16269d354b7e090aa3755e40dff7b7b47bc72d0b8df55f7c7a76a369c5e0165c23d371de4765d66b47699"
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
