SUMMARY = "Manipulate 'soft paths' in PGF"
DESCRIPTION = "The spath3 library provides methods for manipulating the 'soft \
paths' of TikZ/PGF. Packaged with it are two TikZ libraries \
that make use of the methods provided. These are libraries for \
drawing calligraphic paths and for drawing knot diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn64818"

RPM_NAME = "texlive-spath3-2023.201.2.7svn64818-57.1.noarch.rpm"
RPM_HASH = "acb9b96d2cb453f492a9ca5749844aeac8177a0599613c38dceafc91918dcb907a652cea932af11800b803cddb2013856547562173cc42eb86127cade4af9055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(spath3.sty) \
tex(tikzlibrarycalligraphy.code.tex) \
tex(tikzlibraryknots.code.tex) \
tex(tikzlibraryspath3.code.tex) \
texlive-spath3"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(pgf.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
