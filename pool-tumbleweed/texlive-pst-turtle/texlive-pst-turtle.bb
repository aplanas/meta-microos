SUMMARY = "Commands for 'turtle operations'"
DESCRIPTION = "This is a PSTricks related package for creating 'Turtle' \
graphics. It supports the commands forward, back, left, right, \
penup, and pendown."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn52261"

RPM_NAME = "texlive-pst-turtle-2023.201.0.0.02svn52261-53.2.noarch.rpm"
RPM_HASH = "90073cec45e305020e682125413a875fbf9a7b89727444fa336e5be2be54053b55bb20ec005c1808bfd351dac2c3448de784e02d94230df7c5b96449e9d13dae"
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
