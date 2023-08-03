SUMMARY = "Drawing package for circuit and duotensor diagrams"
DESCRIPTION = "This is a drawing package for circuit and duotensor diagrams \
within LaTeX documents. It consists of about eighty commands, \
calling on TikZ for support."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn18728"

RPM_NAME = "texlive-duotenzor-2023.209.1.00svn18728-53.1.noarch.rpm"
RPM_HASH = "6caac924bc90ef9764e3614042958180fe688c6f03d88767b3c30c8dcdb0510bd0a113552a07dbf92528f6f77e0886df53f6e44720f022e387ff32976dbbf008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-duotenzor.sty \
texlive-duotenzor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
