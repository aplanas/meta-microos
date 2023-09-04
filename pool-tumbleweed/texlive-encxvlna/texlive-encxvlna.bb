SUMMARY = "Insert nonbreakable spaces, using encTeX"
DESCRIPTION = "The package provides tools for inserting nonbreakable spaces \
after nonsyllabic prepositions and single letter conjunctions \
as required by Czech and Slovak typographical rules. It is \
implemented using encTeX and provides files both for plain TeX \
and LaTeX. The LaTeX solution tries to avoid conflicts with \
other packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn34087"

RPM_NAME = "texlive-encxvlna-2023.209.1.1svn34087-54.2.noarch.rpm"
RPM_HASH = "55080bd038e9eac005914ace37627a71dcfc2aa07e3d85b73ccfdbc8a24afd7bebf59dffbae98cf3b091beb1cdf9d465217ea99693f6e4b2fef55e5aa811ebde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-encxvlna.sty \
tex-encxvlna.tex \
texlive-encxvlna"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
