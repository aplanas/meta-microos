SUMMARY = "A LaTeX document class for the Journal of Electrical Bioimpedance"
DESCRIPTION = "A document class for writing articles to the Journal of \
Electrical Bioimpedance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn21758"

RPM_NAME = "texlive-elbioimp-2023.209.1.2svn21758-54.1.noarch.rpm"
RPM_HASH = "f74a6f19657a6c6ff5814e4cbb37431114da166efd35d63d608c2d3589ce4aba1b7b18320b11c4691825393fab22baa96c21bb97bd113c32ac8857a98693a72a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elbioimp.cls \
texlive-elbioimp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-ifthen.sty \
tex-mathptmx.sty \
tex-type1cm.sty \
tex-type1ec.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
