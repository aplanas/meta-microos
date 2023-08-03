SUMMARY = "TikZ styles for creating overlaid pictures in beamer"
DESCRIPTION = "The package defines auxiliary TikZ styles useful for overlaying \
pictures' elements in Beamer. The TikZ styles are grouped in a \
library, overlay-beamer-styles which is automatically called by \
the package itself. Users may either load just aobs-tikz or the \
library; the latter method necessitates TikZ manual load."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn32662"

RPM_NAME = "texlive-aobs-tikz-2023.209.1.0svn32662-55.1.noarch.rpm"
RPM_HASH = "1962406443f7a4ba6adde506eb6ac33e9c167c8c0f6a41acf5d75dfc323b983ff629035fad374a021f90d59385f8c8ffec8733f55a135d5925967c8813117118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryoverlay-beamer-styles.code.tex \
texlive-aobs-tikz"

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
