SUMMARY = "Draw Dynkin, Coxeter, and Satake diagrams using TikZ"
DESCRIPTION = "Draws Dynkin, Coxeter, and Satake diagrams in LaTeX documents, \
using the TikZ package. The package requires amsmath, amssymb, \
etoolbox, expl3, mathtools, pgfkeys, pgfopts, TikZ, xparse, and \
xstring."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1415926535897932svn58758"

RPM_NAME = "texlive-dynkin-diagrams-2023.201.3.1415926535897932svn58758-53.1.noarch.rpm"
RPM_HASH = "cf3a3313828c7a74c2fbbb488671d171199dbf202a44d03f2ef4e65c305b6e903c54985622c7355612721914b51bf7f0ab2c2b2e92001b14ddc42612150f6216"
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
