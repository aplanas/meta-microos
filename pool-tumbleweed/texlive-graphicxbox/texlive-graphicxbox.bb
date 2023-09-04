SUMMARY = "Insert a graphical image as a background"
DESCRIPTION = "The package defines two new commands \\graphicxbox and \
\\fgraphicxbox, which are companions to \\colorbox and \\fcolorbox \
of the Standard LaTeX color package. The \\graphicxbox command \
inserts a graphical image as a background rather than a \
background color, while \\fgraphicxbox does the same thing, but \
also draws a colored frame around the box."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn32630"

RPM_NAME = "texlive-graphicxbox-2023.209.1.0svn32630-54.2.noarch.rpm"
RPM_HASH = "c37c0ce38baa31d142b9762fff7bce1cc42f98961f78693699bfd393da6d9dd4bfd26263fbdeca3b766beeeadf6355644dddb2b9b42cb1ba2c8412c261d7c67e"
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
