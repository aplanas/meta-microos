SUMMARY = "Define matrices by given list of values"
DESCRIPTION = "Macros to define and write matrices whose coefficients are \
given row by row in a list of values separated by commas."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn63802"

RPM_NAME = "texlive-simples-matrices-2023.209.1.0.1svn63802-54.1.noarch.rpm"
RPM_HASH = "dfd180ea62d7bda0ac0f867806d98eb6213fb4cc7ed4ddaaf4913d6c24aefb3276c75326ce715ceaa857c55b6917dde4da9ddf757801b8eee4aa3298a08c9604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simples-matrices.sty \
texlive-simples-matrices"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
