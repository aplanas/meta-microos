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

PV = "2023.201.1.31svn24391"

RPM_NAME = "texlive-pst-slpe-2023.201.1.31svn24391-53.2.noarch.rpm"
RPM_HASH = "e3356d6621a8516f5c7968f1fcbfb67af76c909d6bfa86f260d8c467e0b7081ea58baf3019477d2236e159963a2685fc4c5f32c0c8aa2803f0cd793270285efc"
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
