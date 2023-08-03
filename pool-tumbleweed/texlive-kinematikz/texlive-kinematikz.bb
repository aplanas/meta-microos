SUMMARY = "Design kinematic chains and mechanisms"
DESCRIPTION = "This package provides functionalities to draw kinematic \
diagrams for mechanisms using dedicate symbols (some from the \
ISO standard and others). The intention is not to represent CAD \
mechanical drawings of mechanisms and robots, but only to \
represent 2D and 3D kinematic chains. The package provides \
links, joints and other symbols, mostly in the form of TikZ pic \
objects. These pics can be placed in the canvas either by a \
central point for joints, and start and end points for some \
links."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61392"

RPM_NAME = "texlive-kinematikz-2023.209.1.0svn61392-56.1.noarch.rpm"
RPM_HASH = "e78a8e675be9c37ca9f2c1e56bb11a686546ad1a37188e9213e3f9562ffbc6f94dc10cb1c61f62ecdfa1ca328fcb812618ec4161654ed0dc856e8bc74c41b74f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kinematikz.sty \
texlive-kinematikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-tikz-3dplot.sty \
tex-tikz.sty \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
