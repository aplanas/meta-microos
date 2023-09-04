SUMMARY = "Xkcd names of colors"
DESCRIPTION = "In the year 2010, Randall Munroe on posted a really funny and \
nice article on xkcd. He made a very curious experiment: \
showing colors to a lot of people and asking to name each one. \
Afterward, he processed the data and sorted the names for each \
color by popularity -- that means, how many people gave the \
same name to the same color. This package makes the collected \
color names usable with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn54512"

RPM_NAME = "texlive-xkcdcolors-2023.209.1.0.1svn54512-53.2.noarch.rpm"
RPM_HASH = "adc524ea7d4b95fc3cb7aa20b6730a0a6d403dcf06b540fb2e2e592a14c537f6d4deba59c7bc32f575ea15d54a75098ec52e593b23e516894fcd5afebe30a070"
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
