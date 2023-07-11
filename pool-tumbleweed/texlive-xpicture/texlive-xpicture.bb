SUMMARY = "Extensions of LaTeX picture drawing"
DESCRIPTION = "The package extends the facilities of the pict2e and the \
curve2e packages, providing extra reference frames, conic \
section curves, graphs of elementary functions and other \
parametric curves."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn28770"

RPM_NAME = "texlive-xpicture-2023.201.1.2asvn28770-52.2.noarch.rpm"
RPM_HASH = "93ad58c64d6b41d845c2dd1882e9ea44126ada497ea74bafa0e52cd02c16e5138dfe9cf0264d3b15f6e8718a966147752fbc7f8c6c7ece37c6336685c6e398c5"
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
