SUMMARY = "Print tables and generate control files to adjust kernings"
DESCRIPTION = "This class makes it easy to generate tables that show many \
different kerning pairs of an arbitrary font, usable by LaTeX. \
It shows the kerning values that are used in the font by \
default. In addition, this class enables the user to alter the \
kernings and to observe the results. Kerning pairs can be \
defined for groups of similar glyphs at the same time. An mtx \
file is generated automatically. The mtx file may then be \
loaded by fontinst to introduce the user-made kernings into the \
virtual font for later use in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.32svn15878"

RPM_NAME = "texlive-kerntest-2023.201.1.32svn15878-55.1.noarch.rpm"
RPM_HASH = "acbd9481b96bc4e800ec57df69ab60141c5adf1f4a6ba23cf00f43ff457b67d14f8c937059e1d71bee6fd6f684b2d602a3a68f4c36701cdb760096e0bfe08d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(kerntest.cls) \
tex(ly1mtx.clo) \
tex(ot1mtx.clo) \
tex(t1cmr-1200.fd) \
tex(t1mtx.clo) \
tex(t2amtx.clo) \
tex(t2bmtx.clo) \
tex(ts1mtx.clo) \
texlive-kerntest"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(article.cls) \
tex(calc.sty) \
tex(color.sty) \
tex(fontenc.sty) \
tex(geometry.sty) \
tex(helvet.sty) \
tex(ifthen.sty) \
tex(keyval.sty) \
tex(longtable.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
