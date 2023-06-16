SUMMARY = "Xkcd names of colors"
DESCRIPTION = "In the year 2010, Randall Munroe on posted a really funny and \
nice article on xkcd. He made a very curious experiment: \
showing colors to a lot of people and asking to name each one. \
Afterward, he processed the data and sorted the names for each \
color by popularity -- that means, how many people gave the \
same name to the same color. This package makes the collected \
color names usable with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn54512"

RPM_NAME = "texlive-xkcdcolors-2023.201.1.0.1svn54512-52.1.noarch.rpm"
RPM_HASH = "9a7e094e8294c53e40e3d548304a5a6ab4c2d3f00dcf388645e65e5589ecbee50ee4eebab6a04982aa0cad26d6e54d511712b614d14e865c7d813030a1d13572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xkcdcolors.sty \
texlive-xkcdcolors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
