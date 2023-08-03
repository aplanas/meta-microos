SUMMARY = "Good-looking slide decks a la PowerPoint (PPT)"
DESCRIPTION = "This LaTeX package helps you create slide decks as good-looking \
as with PowerPointtm, but more precise, uniform, and visually \
strict. Check this series of lectures fully designed with the \
use of this package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.1svn65194"

RPM_NAME = "texlive-ppt-slides-2023.209.0.0.2.1svn65194-53.1.noarch.rpm"
RPM_HASH = "2c66d99d705b142cd365f50b7f46556a7c23ce8a9676727577439936e7b8bbe5ca176d2a5e0a73b09600d9805ecf8792abd6efe7a8088a8529d38374a1d29d53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ppt-9x6.tex \
tex-ppt-dark-mono.tex \
tex-ppt-dark.tex \
tex-ppt-light-mono.tex \
tex-ppt-light.tex \
tex-ppt-slides.sty \
texlive-ppt-slides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-crumbs.sty \
tex-enumitem.sty \
tex-href-ul.sty \
tex-ifthen.sty \
tex-pagecolor.sty \
tex-pgfopts.sty \
tex-qrcode.sty \
tex-seqsplit.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-tikzpagenodes.sty \
tex-varwidth.sty \
tex-xcolor.sty \
texlive \
texlive-crumbs \
texlive-enumitem \
texlive-filesystem \
texlive-hyperref \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pagecolor \
texlive-pgf \
texlive-pgfopts \
texlive-qrcode \
texlive-scripts \
texlive-scripts-bin \
texlive-seqsplit \
texlive-tikzpagenodes \
texlive-tools \
texlive-varwidth \
texlive-xcolor"

inherit rpm
