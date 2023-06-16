SUMMARY = "Draw tangles, trees, Hopf algebra operations and other pictures"
DESCRIPTION = "A LaTeX2e package for drawing tangles, trees, Hopf algebra \
operations and other pictures. It is based on emTeX or TPIC \
\\specials. Therefore, it can be used with the most popular \
drivers, including emTeX drivers, dviwin, xdvi and dvips, and \
(using some code from ConTeXt) it may also be used with \
pdfLaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-t-angles-2023.201.svn15878-57.1.noarch.rpm"
RPM_HASH = "fa09f2a7b1a49c585f74524135cd30691c808959125643a4e0f9c5744edaa0309ebb927e39a3a72ba843fb99933070b8ed1fe266d1576471fdce144f7f85fcf0"
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
