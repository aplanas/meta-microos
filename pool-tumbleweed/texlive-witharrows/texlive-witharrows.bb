SUMMARY = "'Aligned' math environments with arrows for comments"
DESCRIPTION = "This package provides an environment WithArrows which is \
similar to the environment aligned of amsmath (and mathtools), \
but gives the possibility to draw arrows on the right side of \
the alignment. These arrows are usually used to give \
explanations concerning the mathematical calculus presented. \
The package requires the following other LaTeX packages: expl3, \
footnote, l3keys2e, tikz, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.8asvn65841"

RPM_NAME = "texlive-witharrows-2023.209.2.8asvn65841-54.1.noarch.rpm"
RPM_HASH = "e82d11894b257c5f21f12117318bdabb659bb441a12d5ac1eada60ce898bf4f9b87ea48025b38fc8e0a60988bf0c96c6b4ea080ba1b658b7cc83e382b9c80845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-witharrows.sty \
texlive-witharrows"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-footnote.sty \
tex-footnotehyper.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
