SUMMARY = "Commands for 'turtle operations'"
DESCRIPTION = "This is a PSTricks related package for creating 'Turtle' \
graphics. It supports the commands forward, back, left, right, \
penup, and pendown."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn52261"

RPM_NAME = "texlive-pst-turtle-2023.201.0.0.02svn52261-53.1.noarch.rpm"
RPM_HASH = "aedf2260f771f2a3e5d01ab1e2d4ec640beaa51a9f3fc3147c6b2c4b4d6035b3e8c682bb41e5702badb4f362a20fb9d375681a4ddd6c45635773262e7d2369ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-turtle.sty) \
tex(pst-turtle.tex) \
texlive-pst-turtle"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pst-xkey.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
