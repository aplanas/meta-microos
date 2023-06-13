SUMMARY = "Covers for books published by Kindle Direct Publishing"
DESCRIPTION = "The problem this class solves is the necessity to change the \
size of the cover PDF according to the number of pages in the \
book -- the bigger the book, the larger the spine of the book \
must be. The provided class makes the necessary calculations \
on-the-fly, using the qpdf tool. Obviously, you need to have it \
installed. Also, you must run pdflatex with the --shell-escape \
option, in order to allow LaTeX to run qpdf."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.1svn65150"

RPM_NAME = "texlive-kdpcover-2023.201.0.0.5.1svn65150-55.1.noarch.rpm"
RPM_HASH = "5a4d7e9477aa10fcc94f295bad6c92d3d772bea8ed75ed6e2cb5bf3196781dcd98af66f5ec6f0939f20c8ea43d73a07778c17579840eef46e91c9135b18235d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(kdpcover.cls) \
texlive-kdpcover"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(anyfontsize.sty) \
tex(article.cls) \
tex(calc.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(iexec.sty) \
tex(microtype.sty) \
tex(setspace.sty) \
tex(textpos.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
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
