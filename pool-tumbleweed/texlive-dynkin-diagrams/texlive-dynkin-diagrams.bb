SUMMARY = "Draw Dynkin, Coxeter, and Satake diagrams using TikZ"
DESCRIPTION = "Draws Dynkin, Coxeter, and Satake diagrams in LaTeX documents, \
using the TikZ package. The package requires amsmath, amssymb, \
etoolbox, expl3, mathtools, pgfkeys, pgfopts, TikZ, xparse, and \
xstring."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1415926535897932svn58758"

RPM_NAME = "texlive-dynkin-diagrams-2023.209.3.1415926535897932svn58758-54.2.noarch.rpm"
RPM_HASH = "c10ab3ee1076aa8a5d9c6b438bec403a1010850b60f7defffa189024c13fb6090e08a7d8284fa60b36db45262a3a76ea66e520b8d5d98480d9ee0e7a10831513"
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
