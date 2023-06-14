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

PV = "2023.201.1.0svn61392"

RPM_NAME = "texlive-kinematikz-2023.201.1.0svn61392-55.1.noarch.rpm"
RPM_HASH = "8d327cc32d88352c7ad551eeec7d8ed85c43d035de60c1882ca709d84c2c8216a8ec1f00a7dd06a82a42c8639036f097e6c391d40adbc0dea0ca021ec75989a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kinematikz.sty \
texlive-kinematikz"

RDEPENDS:${PN} += "/bin/sh \
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
