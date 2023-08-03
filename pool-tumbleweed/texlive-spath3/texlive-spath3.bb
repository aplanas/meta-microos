SUMMARY = "Manipulate 'soft paths' in PGF"
DESCRIPTION = "The spath3 library provides methods for manipulating the 'soft \
paths' of TikZ/PGF. Packaged with it are two TikZ libraries \
that make use of the methods provided. These are libraries for \
drawing calligraphic paths and for drawing knot diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn64818"

RPM_NAME = "texlive-spath3-2023.209.2.7svn64818-58.1.noarch.rpm"
RPM_HASH = "fb73cf0e73ddefd49307ab164b82bc31641a10ae420d17033b75bd2836191096ae1e567b8de0d82a9cc90b1b8794a9870bad02ccd6f46bd717e6019a0d4b1cdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spath3.sty \
tex-tikzlibrarycalligraphy.code.tex \
tex-tikzlibraryknots.code.tex \
tex-tikzlibraryspath3.code.tex \
texlive-spath3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pgf.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
