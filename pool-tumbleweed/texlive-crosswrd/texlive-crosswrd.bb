SUMMARY = "Macros for typesetting crossword puzzles"
DESCRIPTION = "The package provides a LaTeX method of typesetting crosswords, \
and assists the composer ensure that the grid all goes together \
properly. Brian Hamilton Kelly's original was written for LaTeX \
2.09, and needed to be updated to run with current LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.204.3.0svn16896"

RPM_NAME = "texlive-crosswrd-2023.204.3.0svn16896-54.1.noarch.rpm"
RPM_HASH = "8f2d2523ea63d3c18dbe47284c08948a61a727fedb6adb7a665a13dc38daf38ef2370f75da2c837327302411bf89a2b0bfc2d6446e963c8e277ab374c11a2b06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(crosswrd.sty) \
texlive-crosswrd"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
