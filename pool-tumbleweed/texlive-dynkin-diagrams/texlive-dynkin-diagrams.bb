SUMMARY = "Draw Dynkin, Coxeter, and Satake diagrams using TikZ"
DESCRIPTION = "Draws Dynkin, Coxeter, and Satake diagrams in LaTeX documents, \
using the TikZ package. The package requires amsmath, amssymb, \
etoolbox, expl3, mathtools, pgfkeys, pgfopts, TikZ, xparse, and \
xstring."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1415926535897932svn58758"

RPM_NAME = "texlive-dynkin-diagrams-2023.201.3.1415926535897932svn58758-53.2.noarch.rpm"
RPM_HASH = "5653daa7df0a31d17b71dca01e252223e5d2aab93b9da8784c42fdbe0c1216be69bf6a55d1c38c399b96ad6c613aef9ab18250d6a498da16564690eeaad74b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dynkin-diagrams.sty \
texlive-dynkin-diagrams"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-mathtools.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
