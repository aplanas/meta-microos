SUMMARY = "A LaTeX class for building legislation files for UMBC Student Government Association Bills"
DESCRIPTION = "LaTeX class for building legislation files for UMBC Student \
Government Association Bills. Requires pdflatex and the \
mdframed enumitem, lineno, and xifthen packages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2016_6_8svn41348"

RPM_NAME = "texlive-umbclegislation-2023.209.2016_6_8svn41348-54.1.noarch.rpm"
RPM_HASH = "93ddfc2c4d2b281e9bf1aceb9c48ce5105840c34d870337fd45369d92e1e84d1d3f8528a5b9090314de67e6ab2a0f110a5bfdf6981bbbfb9917409903334430d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-legislation.cls \
texlive-umbclegislation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-draftwatermark.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-lineno.sty \
tex-mdframed.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
