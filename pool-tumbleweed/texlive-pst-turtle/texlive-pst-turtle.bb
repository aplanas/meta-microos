SUMMARY = "Commands for 'turtle operations'"
DESCRIPTION = "This is a PSTricks related package for creating 'Turtle' \
graphics. It supports the commands forward, back, left, right, \
penup, and pendown."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn52261"

RPM_NAME = "texlive-pst-turtle-2023.209.0.0.02svn52261-54.1.noarch.rpm"
RPM_HASH = "7e97f3c592ea6c296f55db8437f2fe720356e0d5ff5707859c97bbf0ccd1e7086aa5ae586b3fe336a295073e5fdd53b5d674698094ff3ae85aad494f6773942f"
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
