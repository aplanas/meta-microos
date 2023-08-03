SUMMARY = "A thesis class for Beijing Forestry University"
DESCRIPTION = "This is a class file for producing dissertations and theses \
according to the Beijing Forestry University (BJFU) Guidelines \
for Undergraduate Theses and Dissertations. The class should \
meet all current requirements and is updated whenever the \
university guidelines change."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2.1svn59809"

RPM_NAME = "texlive-bjfuthesis-2023.209.1.2.1svn59809-53.1.noarch.rpm"
RPM_HASH = "a8d2822ab5071d40f918af060565c7ee2690c7f890d9940555fe7681beee4bf1a99efaf2e0f870329acfa344cced382af2385b1c0c174903347a6eeb7f248e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bjfuthesis.cls \
texlive-bjfuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-biblatex.sty \
tex-bicaption.sty \
tex-booktabs.sty \
tex-ctexbook.cls \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-pdfpages.sty \
tex-silence.sty \
tex-titlesec.sty \
tex-titletoc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
