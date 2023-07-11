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

RPM_NAME = "texlive-xkcdcolors-2023.201.1.0.1svn54512-52.2.noarch.rpm"
RPM_HASH = "1c6ff1949077f6a6a50220bcd0b2a4a80e79df4c216a93a8300c4986af0e05ab58dc5d64ec46d27ad37f76acc27716d827b7881148a85ba9bf0f8c768cbd6a00"
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
