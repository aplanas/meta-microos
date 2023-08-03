SUMMARY = "Show ConTeXt layouts"
DESCRIPTION = "Draws a representation of the layout of the current page and \
displays the sizes of the widths and heights of the margins, \
header, footer and text body."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-layout-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "15941c685e5541a4413fead21ebdd39fb5d6a79c4ca0beb3eb9485dc8d3533c4fb6e9268fb194d5990123f5d2e3bfe51672a239472cb861aef3b6d278dfa1d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-layout.tex \
texlive-context-layout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
