SUMMARY = "Format documents in APA style (7th edition)"
DESCRIPTION = "This class formats documents in APA style (7th Edition). It \
provides a full set of facilities in four different output \
modes (journal-like appearance, double-spaced manuscript, \
double-spaced student manuscript, LaTeX-like document). The \
class can mask author identity for copies for use in masked \
peer review. The class is a development of the apa6 class."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.16svn63974"

RPM_NAME = "texlive-apa7-2023.201.2.16svn63974-54.1.noarch.rpm"
RPM_HASH = "a3d59edd4f43ec992d20492e6ed15fedddb419fb510718f032b7b39a3147b19bdfe375bb6bd0bbe6205c59fbdc1c207326188ea68b588f10ae416e6203c1d879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(APA7endfloat.cfg) \
tex(apa7.cls) \
texlive-apa7"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(apacite.sty) \
tex(array.sty) \
tex(article.cls) \
tex(babel.sty) \
tex(biblatex.sty) \
tex(bm.sty) \
tex(booktabs.sty) \
tex(caption.sty) \
tex(draftwatermark.sty) \
tex(endfloat.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(float.sty) \
tex(flushend.sty) \
tex(fontenc.sty) \
tex(ftnright.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(lmodern.sty) \
tex(longtable.sty) \
tex(mathptm.sty) \
tex(pslatex.sty) \
tex(scalerel.sty) \
tex(substr.sty) \
tex(threeparttable.sty) \
tex(tikz.sty) \
tex(times.sty) \
tex(txfonts.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
