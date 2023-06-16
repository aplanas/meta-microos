SUMMARY = "A modern curriculum vitae class"
DESCRIPTION = "The class provides facilities for typesetting modern \
curriculums vitae, both in a classic and in a casual style. It \
is fairly customizable, allowing you to define your own style \
by changing the colours, the fonts, etc. The template.tex file \
can be used as an example."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.1svn62128"

RPM_NAME = "texlive-moderncv-2023.201.2.3.1svn62128-54.1.noarch.rpm"
RPM_HASH = "9ae82672a6602461147b8be058828ff8221802ce8a14b6ffdf5c9c494a7102a35c6cb90f7c5b712e29245deac9ea863d9eb968d3a9f2c5a1b389b9436b41f87e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moderncv.cls \
tex-moderncvbodyi.sty \
tex-moderncvbodyii.sty \
tex-moderncvbodyiii.sty \
tex-moderncvbodyiv.sty \
tex-moderncvbodyv.sty \
tex-moderncvcollection.sty \
tex-moderncvcolorblack.sty \
tex-moderncvcolorblue.sty \
tex-moderncvcolorburgundy.sty \
tex-moderncvcolorgreen.sty \
tex-moderncvcolorgrey.sty \
tex-moderncvcolororange.sty \
tex-moderncvcolorpurple.sty \
tex-moderncvcolorred.sty \
tex-moderncvcompatibility.sty \
tex-moderncvdebugtools.sty \
tex-moderncvfooti.sty \
tex-moderncvheadi.sty \
tex-moderncvheadii.sty \
tex-moderncvheadiii.sty \
tex-moderncvheadiv.sty \
tex-moderncvheadv.sty \
tex-moderncvheadvi.sty \
tex-moderncviconsacademic.sty \
tex-moderncviconsawesome.sty \
tex-moderncviconsletters.sty \
tex-moderncviconsmarvosym.sty \
tex-moderncviconssymbols.sty \
tex-moderncviconstikz.sty \
tex-moderncvskillmatrix.sty \
tex-moderncvstylebanking.sty \
tex-moderncvstylecasual.sty \
tex-moderncvstyleclassic.sty \
tex-moderncvstyleempty.sty \
tex-moderncvstylefancy.sty \
tex-moderncvstyleoldstyle.sty \
tex-tweaklist.sty \
texlive-moderncv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-academicons.sty \
tex-arydshln.sty \
tex-calc.sty \
tex-changepage.sty \
tex-ebgaramond.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-fontawesome5.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-kurier.sty \
tex-microtype.sty \
tex-multirow.sty \
tex-tgpagella.sty \
tex-tikz.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-etoolbox \
texlive-fancyhdr \
texlive-filesystem \
texlive-graphics \
texlive-hyperref \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-microtype \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-url \
texlive-xcolor"

inherit rpm
