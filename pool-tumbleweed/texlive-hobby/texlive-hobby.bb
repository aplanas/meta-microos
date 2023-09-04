SUMMARY = "An implementation of Hobby's algorithm for PGF/TikZ"
DESCRIPTION = "This package defines a path generation function for PGF/TikZ \
which implements Hobby's algorithm for a path built out of \
Bezier curves which passes through a given set of points. The \
path thus generated may by used as a TikZ 'to path'. The \
implementation is in LaTeX3."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn44474"

RPM_NAME = "texlive-hobby-2023.209.1.8svn44474-54.2.noarch.rpm"
RPM_HASH = "0c3ff359d6f17ef1c598d5edb39dbf93d5d3dd8b3a6d594d467393622591537156ea44827a60ab58630844d1898aab655cde3f072f7253d1985f158b422722c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hobby.code.tex \
tex-pgflibraryhobby.code.tex \
tex-pml3array.sty \
tex-tikzlibraryhobby.code.tex \
texlive-hobby"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
