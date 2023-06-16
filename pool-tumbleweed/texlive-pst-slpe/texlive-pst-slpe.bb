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

RPM_NAME = "texlive-pst-slpe-2023.201.1.31svn24391-53.1.noarch.rpm"
RPM_HASH = "a5e38e2f584e2d1177e96271cd86ce73e512f7e35225ee4178695ffd49e37dc5282a76fbad9ab8bfc187eab67e4a50b11f7888e7573007689e1017321cbefcbe"
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
