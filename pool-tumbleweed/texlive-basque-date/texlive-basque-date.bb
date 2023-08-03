SUMMARY = "Print the date in Basque"
DESCRIPTION = "The package provides two LaTeX commands to print the current \
date in Basque according to the correct forms ruled by The \
Basque Language Academy (Euskaltzaindia). The commands \
automatically solve the complex declination issues of numbers \
in Basque."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn26477"

RPM_NAME = "texlive-basque-date-2023.209.1.05svn26477-54.1.noarch.rpm"
RPM_HASH = "07f5873bc4fc9b309c63b17db18f72635de2467aad396072e8ab6b7e8e4b918d8bba49a1129f9ecaa698dc5c4a026529d2951dabcaa913970dab837feef35264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basque-date.sty \
texlive-basque-date"

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
