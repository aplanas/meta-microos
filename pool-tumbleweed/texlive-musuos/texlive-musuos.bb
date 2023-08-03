SUMMARY = "Typeset papers for the department of music, Osnabruck"
DESCRIPTION = "The package provides a LaTeX class for typesetting term papers \
at the institute of music and musicology of the University of \
Osnabruck, Germany, according to the specifications of Prof. \
Stefan Hahnheide. A BibLaTeX style is provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1dsvn24857"

RPM_NAME = "texlive-musuos-2023.209.1.1dsvn24857-55.1.noarch.rpm"
RPM_HASH = "6ead1dea78b5cba05d9cad453b36634e6f34fa4f8bfbe83d05bb65e6a1a1fb59aeb7ec644ed41a6a765b0af98b70ec5e38a177e14eabe22d9a9b570f8a484e61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musuos.cls \
texlive-musuos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csquotes.sty \
tex-dblfnote.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-kpfonts.sty \
tex-kvoptions.sty \
tex-scrartcl.cls \
tex-setspace.sty \
tex-tgheros.sty \
tex-titletoc.sty \
tex-txfonts.sty \
tex-verse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
