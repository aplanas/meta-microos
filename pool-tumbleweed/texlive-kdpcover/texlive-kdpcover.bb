SUMMARY = "Covers for books published by Kindle Direct Publishing"
DESCRIPTION = "The problem this class solves is the necessity to change the \
size of the cover PDF according to the number of pages in the \
book -- the bigger the book, the larger the spine of the book \
must be. The provided class makes the necessary calculations \
on-the-fly, using the qpdf tool. Obviously, you need to have it \
installed. Also, you must run pdflatex with the --shell-escape \
option, in order to allow LaTeX to run qpdf."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.1svn65150"

RPM_NAME = "texlive-kdpcover-2023.209.0.0.5.1svn65150-56.1.noarch.rpm"
RPM_HASH = "f51aadc72cc0f2e8fed45a4ab9498a0290a93381de38aaa3be311fb5da4ae703d35617560929c6b9c346aab2694ddc0f44bb572e14c70c78cf8dd53868b86dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kdpcover.cls \
texlive-kdpcover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-article.cls \
tex-calc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-iexec.sty \
tex-microtype.sty \
tex-setspace.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-anyfontsize \
texlive-filesystem \
texlive-geometry \
texlive-graphics \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-microtype \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-setspace \
texlive-textpos \
texlive-tools \
texlive-xcolor \
texlive-xifthen \
texlive-xkeyval"

inherit rpm
