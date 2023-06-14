SUMMARY = "Typeset a thesis at Bangor University"
DESCRIPTION = "The class typesets thesis/dissertation documents for all levels \
(i.e., both undergraduate and graduate students may use the \
class). It also provides macros designed to optimise the \
process of producing a thesis."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.5svn61770"

RPM_NAME = "texlive-bangorcsthesis-2023.201.1.5.5svn61770-53.1.noarch.rpm"
RPM_HASH = "b9c48bda8fa46d6e2d000a398649bc5f36c8ebfc00df0fa07aecf824e1e6db50ec6cba5d51a82359c85ce7271a6f079b046e0ee56b6a5152d78d6cd11be02423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bangorcsthesis.cls \
texlive-bangorcsthesis"

RDEPENDS:${PN} += "/bin/sh \
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
