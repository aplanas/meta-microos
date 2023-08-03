SUMMARY = "Typeset a thesis at Bangor University"
DESCRIPTION = "The class typesets thesis/dissertation documents for all levels \
(i.e., both undergraduate and graduate students may use the \
class). It also provides macros designed to optimise the \
process of producing a thesis."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.5svn61770"

RPM_NAME = "texlive-bangorcsthesis-2023.209.1.5.5svn61770-54.1.noarch.rpm"
RPM_HASH = "e4ef43d60163c1eea74d74f9a335b10a8cdb8e0e08c460db5fcdb606f37b9f77f26128ccaa0261878bcec3380e46c29dca95a7f7e8a35155fd7c4963137c24a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bangorcsthesis.cls \
texlive-bangorcsthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-babel.sty \
tex-berasans.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-draftwatermark.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fifo-stack.sty \
tex-fontenc.sty \
tex-forloop.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-isodate.sty \
tex-microtype.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-parskip.sty \
tex-report.cls \
tex-setspace.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-totalcount.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
