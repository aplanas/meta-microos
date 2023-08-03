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

RPM_NAME = "texlive-xkcdcolors-2023.209.1.0.1svn54512-53.1.noarch.rpm"
RPM_HASH = "db209e03a7b0585b669cb9a57c2dd85d7ed162e49b3661a275be926efad7a52343240889c839bcde0690d5f3675e321431910fc6b0ac377015e0f4b11d54cb87"
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
