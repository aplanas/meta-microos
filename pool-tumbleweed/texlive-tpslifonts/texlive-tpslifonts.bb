SUMMARY = "A LaTeX package for configuring presentation fonts"
DESCRIPTION = "This package aims to improve of font readability in \
presentations, especially with maths. The standard cm maths \
fonts at large design sizes are difficult to read from far \
away, especially at low resolutions and low contrast color \
choice. Using this package leads to much better overall \
readability of some font combinations. The package offers a \
couple of 'harmonising' combinations of text and maths fonts \
from the (distant) relatives of computer modern fonts, with a \
couple of extras for optimising readability. Text fonts from \
computer modern roman, computer modern sans serif, SliTeX \
computer modern sans serif, computer modern bright, or concrete \
roman are available, in addition to maths fonts from computer \
modern maths, computer modern bright maths, or Euler fonts. The \
package is part of the TeXPower bundle."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6svn42428"

RPM_NAME = "texlive-tpslifonts-2023.209.0.0.6svn42428-53.1.noarch.rpm"
RPM_HASH = "649562491530b810814c76ffb63e42e4fcfc6d941032e7b6910f785bb398078bfe41ef91796e1c4d32cbd692c4c433528a9b094799cbbe5237c97a7431349263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tpslifonts.sty \
texlive-tpslifonts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmbright.sty \
tex-eulervm.sty \
tex-ifthen.sty \
tex-t1cmdh.fd \
tex-t1cmfib.fd \
tex-t1cmfr.fd \
tex-t1cmr.fd \
tex-t1cmss.fd \
tex-t1cmtt.fd \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
