SUMMARY = "Insert a graphical image as a background"
DESCRIPTION = "The package defines two new commands \\graphicxbox and \
\\fgraphicxbox, which are companions to \\colorbox and \\fcolorbox \
of the Standard LaTeX color package. The \\graphicxbox command \
inserts a graphical image as a background rather than a \
background color, while \\fgraphicxbox does the same thing, but \
also draws a colored frame around the box."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn32630"

RPM_NAME = "texlive-graphicxbox-2023.201.1.0svn32630-53.2.noarch.rpm"
RPM_HASH = "90792d5db3d31524cba49e5f09245451a10fbb05aafaa483dcf0fc8c1b253d2dff39e91596f9cc6f01aa52d5cda2d3e1d909ce06dd1ba0725e903f94e6c5724a"
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
