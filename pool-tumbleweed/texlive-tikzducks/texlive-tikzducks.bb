SUMMARY = "A little fun package for using rubber ducks in TikZ"
DESCRIPTION = "The package is a LaTeX package for ducks to be used in TikZ \
pictures. This project is a continuation of an answer at \
StackExchange How we can draw a duck?"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn55713"

RPM_NAME = "texlive-tikzducks-2023.209.1.5svn55713-53.1.noarch.rpm"
RPM_HASH = "a8be1e9af72a1ea14bbd577add6e012a35c3a65a305862cef5fd4759fba1661091e7cdbd239e46a28586942594a272ec8995a37a3ff2e44db50cbe8dad32f194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzducks-generic.tex \
tex-tikzducks.sty \
tex-tikzlibraryducks.code.tex \
texlive-tikzducks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
