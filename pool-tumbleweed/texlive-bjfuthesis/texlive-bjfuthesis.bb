SUMMARY = "A thesis class for Beijing Forestry University"
DESCRIPTION = "This is a class file for producing dissertations and theses \
according to the Beijing Forestry University (BJFU) Guidelines \
for Undergraduate Theses and Dissertations. The class should \
meet all current requirements and is updated whenever the \
university guidelines change."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2.1svn59809"

RPM_NAME = "texlive-bjfuthesis-2023.201.1.2.1svn59809-52.1.noarch.rpm"
RPM_HASH = "36bca1ed287cef8d55086719f458d350dc9f324a8a17c5eda765c6d5c92af1352abed7e9cfa20f8d335473ef14293a8a2c4742f2ce086754eec7381c99012f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bjfuthesis.cls \
texlive-bjfuthesis"

RDEPENDS:${PN} += "/bin/sh \
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
