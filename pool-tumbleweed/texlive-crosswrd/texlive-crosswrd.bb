SUMMARY = "Macros for typesetting crossword puzzles"
DESCRIPTION = "The package provides a LaTeX method of typesetting crosswords, \
and assists the composer ensure that the grid all goes together \
properly. Brian Hamilton Kelly's original was written for LaTeX \
2.09, and needed to be updated to run with current LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn16896"

RPM_NAME = "texlive-crosswrd-2023.209.3.0svn16896-55.1.noarch.rpm"
RPM_HASH = "bb9d4db7c89e950f953b56e11ded66e741202f1ee2caf369c1f21afa67ecc6feda5be8f0d03fc4a544a1ade9b71e5134541c3c9d21b3414a7d240ab501ee9020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crosswrd.sty \
texlive-crosswrd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
