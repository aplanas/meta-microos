SUMMARY = "Insert a graphical image as a background"
DESCRIPTION = "The package defines two new commands \\graphicxbox and \
\\fgraphicxbox, which are companions to \\colorbox and \\fcolorbox \
of the Standard LaTeX color package. The \\graphicxbox command \
inserts a graphical image as a background rather than a \
background color, while \\fgraphicxbox does the same thing, but \
also draws a colored frame around the box."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn32630"

RPM_NAME = "texlive-graphicxbox-2023.209.1.0svn32630-54.1.noarch.rpm"
RPM_HASH = "774c500524f7e24d933390839ca3991060137e0d998e8dfeef8614b5c9700bc7720c2dbf17afcdb4f896804d6271164eb0994235c35c2676451f636ee142fc26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphicxbox.sty \
texlive-graphicxbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
