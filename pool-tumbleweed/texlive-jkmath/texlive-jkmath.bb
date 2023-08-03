SUMMARY = "Macros for mathematics that make the code more readable"
DESCRIPTION = "Inspired by the physicspackage on CTAN, the package defines \
some simple macros for mathematical notation which make the \
code more readable and/or allow flexibility in typesetting \
material."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn47109"

RPM_NAME = "texlive-jkmath-2023.209.0.0.1svn47109-56.1.noarch.rpm"
RPM_HASH = "e8f9202c2b4156163d1f78627d3d45484b0a124f88642c01677c2d40ba57842a84f657ffd59537219397fba635d1dee8b4277ff9823ba9e711d873b72c84a4b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jkmath.sty \
texlive-jkmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-physics.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
