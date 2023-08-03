SUMMARY = "Sophisticated colour gradients"
DESCRIPTION = "This PStricks package covers all the colour gradient \
functionality of pst-grad (part of the base PSTricks \
distribution), and provides the following facilities: it \
permits the user to specify an arbitrary number of colours, \
along with the points at which they are to be reached; it \
converts between RGB and HSV behind the scenes; it provides \
concentric and radial gradients; it provides a command \\psBall \
that generates bullets with a three-dimensional appearance; and \
uses the xkeyval package for the extended key handling."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.31svn24391"

RPM_NAME = "texlive-pst-slpe-2023.209.1.31svn24391-54.1.noarch.rpm"
RPM_HASH = "cc8419c04bec20efdd741656851af2ce8a12f678718ca2cffbf3b93dd95d8d7ffc1438b5c593667e0fff6debf19b227068afdf4193f0082b316cc4a9f0d2dec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-slpe.sty \
tex-pst-slpe.tex \
texlive-pst-slpe"

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
