SUMMARY = "Draw GANTT charts with PSTricks"
DESCRIPTION = "The package uses PSTricks to draw GANTT charts, which are a \
kind of bar chart that displays a project schedule. The package \
requires the pstricks apparatus, of course."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.22asvn35832"

RPM_NAME = "texlive-pst-gantt-2023.209.0.0.22asvn35832-53.1.noarch.rpm"
RPM_HASH = "b313a654d55ecc86d5da5fad1d02263226c821fea8d9ef4bf2a0c96e039098d6714df9140524ab62d2675f1affb66634ae52664c0a603f3c1ee51b91f67e8cad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-gantt.sty \
tex-pst-gantt.tex \
texlive-pst-gantt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
