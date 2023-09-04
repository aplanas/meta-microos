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

RPM_NAME = "texlive-pst-slpe-2023.209.1.31svn24391-54.2.noarch.rpm"
RPM_HASH = "dfe66d8118ae7b6172ff7dc99ca0a473c35b251f45ba43ea5c9197469b85045372cdc5193ef75553ca9618d22bf6c4ac5c14576d5780edba771ce4ca0904625d"
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
