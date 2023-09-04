SUMMARY = "Extensions to epic and the LaTeX drawing tools"
DESCRIPTION = "Extensions to epic and the LaTeX picture drawing environment, \
include the drawing of lines at any slope, the drawing of \
circles in any radii, and the drawing of dotted and dashed \
lines much faster with much less TeX memory, and providing \
several new commands for drawing ellipses, arcs, splines, and \
filled circles and ellipses. The package uses tpic \\special \
commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.1esvn15878"

RPM_NAME = "texlive-eepic-2023.209.1.1esvn15878-54.2.noarch.rpm"
RPM_HASH = "83d640eb4f0d1e4a3fe87f4277aca7d57d9cb6c69ae2c9245ad5f610a0baf54164be2f2d6ad1b2094149ac121fde1ad5db7c230db3066a816bda477e7bc8d4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eepic.sty \
tex-eepicemu.sty \
tex-epic.sty \
texlive-eepic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
