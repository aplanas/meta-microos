SUMMARY = "Draw objects for Chemistry laboratories"
DESCRIPTION = "Pst-labo is a PSTricks related package for drawing basic and \
complex chemical objects. The documentation of the package is \
illuminated with plenty of illustrations together with their \
source code, making it an easy read."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.04svn39077"

RPM_NAME = "texlive-pst-labo-2023.209.2.04svn39077-53.1.noarch.rpm"
RPM_HASH = "d2ffda129a49503b50bc50e4bc15c470609032dc8ca9e9ff8136050c0ee14a8dacd639433cc694855e4fafa0d51577b979ef4536bb1a44dda992cc89b39f2d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-labo.sty \
tex-pst-labo.tex \
tex-pst-laboObj.tex \
texlive-pst-labo"

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
