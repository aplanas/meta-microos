SUMMARY = "Draw liftarms"
DESCRIPTION = "This package can be used to draw liftarms with TikZ. It \
provides several options for the appearance of the liftarms, a \
command which connects two liftarms and an environment to \
describe a construction."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn62981"

RPM_NAME = "texlive-liftarm-2023.209.2.0svn62981-55.1.noarch.rpm"
RPM_HASH = "fda70d8f85a8e67954d175ae127843dcaa2df55d130b9c74a03a696905ded41d973d24615ba0250261de54861e201177fe454416c0ac399ea9c87891fe3f62ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-liftarm.sty \
texlive-liftarm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
