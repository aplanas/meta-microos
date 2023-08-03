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

PV = "2023.209.1.32svn15878"

RPM_NAME = "texlive-kerntest-2023.209.1.32svn15878-56.1.noarch.rpm"
RPM_HASH = "3aa60def32f79d9975f782b157ccb769edb049148a3d08073c32009659ac6140cf7f98faf6c710bd4f9dfb1a1a7ddab8c48d847b9301df0d68fc2d0d897f7d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kerntest.cls \
tex-ly1mtx.clo \
tex-ot1mtx.clo \
tex-t1cmr-1200.fd \
tex-t1mtx.clo \
tex-t2amtx.clo \
tex-t2bmtx.clo \
tex-ts1mtx.clo \
texlive-kerntest"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-calc.sty \
tex-color.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
