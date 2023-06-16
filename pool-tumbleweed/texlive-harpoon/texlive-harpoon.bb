SUMMARY = "Extra harpoons, using the graphics package"
DESCRIPTION = "Provides over- and under-harpoon symbol commands; the harpoons \
may point in either direction, with the hook pointing up or \
down. The covered object is provided as an argument to the \
commands, so that they have the look of accent commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn21327"

RPM_NAME = "texlive-harpoon-2023.201.1.0svn21327-53.1.noarch.rpm"
RPM_HASH = "33a62b2b9b91c4184e0c22f0d34fae2b878d188dc42fb53f4e7e5500105d0df0c37ee388eb87ee6e4e60864d3480203deac2d5ca002210477461f6e1456fa737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harpoon.sty \
texlive-harpoon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
