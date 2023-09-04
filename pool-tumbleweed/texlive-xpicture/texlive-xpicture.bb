SUMMARY = "Extensions of LaTeX picture drawing"
DESCRIPTION = "The package extends the facilities of the pict2e and the \
curve2e packages, providing extra reference frames, conic \
section curves, graphs of elementary functions and other \
parametric curves."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn28770"

RPM_NAME = "texlive-xpicture-2023.209.1.2asvn28770-53.2.noarch.rpm"
RPM_HASH = "2d3ca902dd59e382bb0d3f1754211040ddab6ee7904a5629ac2de3054db52d2b9434aa4dd4ae64c63206307d9b9524bd599004366af4be411cb26c2348a5b42f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpicture.sty \
texlive-xpicture"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calculus.sty \
tex-curve2e.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
