SUMMARY = "Format documents in APA style (7th edition)"
DESCRIPTION = "This class formats documents in APA style (7th Edition). It \
provides a full set of facilities in four different output \
modes (journal-like appearance, double-spaced manuscript, \
double-spaced student manuscript, LaTeX-like document). The \
class can mask author identity for copies for use in masked \
peer review. The class is a development of the apa6 class."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.16svn63974"

RPM_NAME = "texlive-apa7-2023.209.2.16svn63974-55.1.noarch.rpm"
RPM_HASH = "e66f9c041d39d8f16d1ed58995fedc2bec3a61bd277915e432ccf24d82c10d5bbe5b6891a1200034b637eb3e5dfebb0cd2b19880954e14309c19dd9017d0e02a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-APA7endfloat.cfg \
tex-apa7.cls \
texlive-apa7"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-apacite.sty \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-biblatex.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-draftwatermark.sty \
tex-endfloat.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-flushend.sty \
tex-fontenc.sty \
tex-ftnright.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-mathptm.sty \
tex-pslatex.sty \
tex-scalerel.sty \
tex-substr.sty \
tex-threeparttable.sty \
tex-tikz.sty \
tex-times.sty \
tex-txfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
