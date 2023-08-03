SUMMARY = "Format documents in APA style (6th edition)"
DESCRIPTION = "The class formats documents in APA style (6th Edition). It \
provides a full set of facilities in three different output \
modes (journal-like appearance, double-spaced manuscript, \
LaTeX-like document), in contrast to the earlier apa6e, which \
only formats double-spaced manuscripts in APA style. The class \
can mask author identity for copies for use in masked peer \
review. The class is a development of the apa class (which is \
no longer maintained)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.34svn53406"

RPM_NAME = "texlive-apa6-2023.209.2.34svn53406-55.1.noarch.rpm"
RPM_HASH = "0bacd122b7e09a9589d4743a4e15060273176f3ae47d232927ecb5f98abb2a6e2bb5800d0bd3f535004cef12db57e1f627bd46e6bf70c9ed7dedf0a388635ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-APAendfloat.cfg \
tex-apa6.cls \
texlive-apa6"

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
tex-lmodern.sty \
tex-longtable.sty \
tex-mathptm.sty \
tex-pslatex.sty \
tex-substr.sty \
tex-threeparttable.sty \
tex-times.sty \
tex-txfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
