SUMMARY = "Graphical macros, using embedded PostScript"
DESCRIPTION = "TeXdraw is a set of macro definitions for TeX, which allow the \
user to produce PostScript drawings from within TeX and LaTeX. \
TeXdraw has been designed to be extensible. Drawing 'segments' \
are relocatable, self-contained units. Using a combination of \
TeX's grouping mechanism and the gsave/grestore mechanism in \
PostScript, drawing segments allow for local changes to the \
scaling and line parameters. Using TeX's macro definition \
capability, new drawing commands can be constructed from \
drawing segments."
LICENSE = "LPPL-1.0"

PV = "2023.209.v2r3svn64477"

RPM_NAME = "texlive-texdraw-2023.209.v2r3svn64477-55.1.noarch.rpm"
RPM_HASH = "11782ec49d0c0ec944562238eee00e6435346a8f374da8fe941e03a8180da92ddaa07eaee12cfe0f4514b24cf9adbf8329ce863c6bc25bf1354d3d3287c4a386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blockdiagram.tex \
tex-texdraw.sty \
tex-texdraw.tex \
tex-txdps.tex \
tex-txdtools.tex \
texlive-texdraw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
