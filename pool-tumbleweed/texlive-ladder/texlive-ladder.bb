SUMMARY = "Draw simple ladder diagrams using TikZ"
DESCRIPTION = "This package permits the creation of simple ladder diagrams \
within LaTeX documents. Required packages are tikz, ifthen, and \
calc."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44394"

RPM_NAME = "texlive-ladder-2023.209.svn44394-56.1.noarch.rpm"
RPM_HASH = "6fbcf1f1041993bdf69f41c291ae793c3264353b131da3a36e0d64f68e6a52af17ef1d3a7c8ae082d4733221579c11f98c45704a4af4039420001f97222f2abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ladder.sty \
texlive-ladder"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
