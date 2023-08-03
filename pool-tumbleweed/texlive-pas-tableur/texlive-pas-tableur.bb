SUMMARY = "Create a spreadsheet layout"
DESCRIPTION = "The package provides commands for creating a grid of \
rectangles, and commands for populating locations in the grid. \
PGF/TikZ is used for placement and population of the cells."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01svn39542"

RPM_NAME = "texlive-pas-tableur-2023.209.2.01svn39542-52.1.noarch.rpm"
RPM_HASH = "1fb10601997058abbd359458d961caa7f91bbf79659af58ad391d3f9e488a55f80c4c33ed2de13f2e5e311214523c51b7e75f589d42ff71951977be61fcae6ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pas-tableur.sty \
texlive-pas-tableur"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
