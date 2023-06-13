SUMMARY = "TikZ styles for creating overlaid pictures in beamer"
DESCRIPTION = "The package defines auxiliary TikZ styles useful for overlaying \
pictures' elements in Beamer. The TikZ styles are grouped in a \
library, overlay-beamer-styles which is automatically called by \
the package itself. Users may either load just aobs-tikz or the \
library; the latter method necessitates TikZ manual load."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn32662"

RPM_NAME = "texlive-aobs-tikz-2023.201.1.0svn32662-54.1.noarch.rpm"
RPM_HASH = "abd03126b87061c1099e7e5f3ac07be7db1c5e2640e2caf5a546b26439edbb66e1b86c26c76673d9a85d5f0b8b3d3d2ab0ea26fb636dfcd92518b451aed0e077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzlibraryoverlay-beamer-styles.code.tex) \
texlive-aobs-tikz"

RDEPENDS:${PN} += "/bin/sh \
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
