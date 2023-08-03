SUMMARY = "Draw tangles, trees, Hopf algebra operations and other pictures"
DESCRIPTION = "A LaTeX2e package for drawing tangles, trees, Hopf algebra \
operations and other pictures. It is based on emTeX or TPIC \
\\specials. Therefore, it can be used with the most popular \
drivers, including emTeX drivers, dviwin, xdvi and dvips, and \
(using some code from ConTeXt) it may also be used with \
pdfLaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-t-angles-2023.209.svn15878-58.1.noarch.rpm"
RPM_HASH = "e480a588e96fdd8843cdc5e44ea27e39ea5fac01d2f024e0ea3e87d0fdfb57ba71188fb2e8fff2b8d3b1151fa60019518098c98464bf1cb62255c7f02c9b07f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-angles.sty \
texlive-t-angles"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
