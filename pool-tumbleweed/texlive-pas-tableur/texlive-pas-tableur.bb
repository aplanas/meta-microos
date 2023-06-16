SUMMARY = "Create a spreadsheet layout"
DESCRIPTION = "The package provides commands for creating a grid of \
rectangles, and commands for populating locations in the grid. \
PGF/TikZ is used for placement and population of the cells."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01svn39542"

RPM_NAME = "texlive-pas-tableur-2023.201.2.01svn39542-51.1.noarch.rpm"
RPM_HASH = "3e4c907f3342d6540fc223f92882fb88d07f95d2071a867033bc415d17b95704c71e54d5112fb3568c2c018a8ad14b7df6aee9ecb66d3ff95bb480e5e532bff5"
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
