SUMMARY = "Extensions of LaTeX picture drawing"
DESCRIPTION = "The package extends the facilities of the pict2e and the \
curve2e packages, providing extra reference frames, conic \
section curves, graphs of elementary functions and other \
parametric curves."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn28770"

RPM_NAME = "texlive-xpicture-2023.209.1.2asvn28770-53.1.noarch.rpm"
RPM_HASH = "59b02f64a1e83cba6c89f92d14eec8ea5d858f1d5bf9ee5eaac404c3cb3c41b84fdf4cf56e2b2e6a9fb0a38a040cef8d6491aa6a6c635febcb0baa11bf72aa84"
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
