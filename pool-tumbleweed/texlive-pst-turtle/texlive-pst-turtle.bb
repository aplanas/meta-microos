SUMMARY = "Commands for 'turtle operations'"
DESCRIPTION = "This is a PSTricks related package for creating 'Turtle' \
graphics. It supports the commands forward, back, left, right, \
penup, and pendown."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn52261"

RPM_NAME = "texlive-pst-turtle-2023.209.0.0.02svn52261-54.2.noarch.rpm"
RPM_HASH = "24dc5837077f1cfd1d1f3bbab5aa0403263c4b03b18d950b7d8522b4a0cba091c1e0051bf405c3ec689e2e6bf4b9f33aa52bf8bca8118514ba7968bbf7a03c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-turtle.sty \
tex-pst-turtle.tex \
texlive-pst-turtle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
