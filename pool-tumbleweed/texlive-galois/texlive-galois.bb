SUMMARY = "Typeset Galois connections"
DESCRIPTION = "The package deals with connections in two-dimensional style, \
optionally in colour."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-galois-2023.209.1.5svn15878-53.1.noarch.rpm"
RPM_HASH = "768cbc80fbce3f90e6e1f92a52969190bf7f3d04681fb5dd437f0a92eeb2c953b9178d5e21902ab4c020b77b7d5c09092dafe0c60029cafd5eb5557966ce0ae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-galois.sty \
texlive-galois"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
