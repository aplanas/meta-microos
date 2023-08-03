SUMMARY = "University of Michigan Thesis LaTeX class"
DESCRIPTION = "A LaTeX2e class to create a University of Michigan dissertation \
according to the Rackham dissertation handbook."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn15878"

RPM_NAME = "texlive-umich-thesis-2023.209.1.20svn15878-54.1.noarch.rpm"
RPM_HASH = "21f6a8a720574fa0b0b0a3a35afada8a01d5890fee826dbd9e58c116a10d19ad2cea368997603da5d25318453ebabc4641215b892369e2cdfa23ceec0ff32b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-umich-thesis.cls \
texlive-umich-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-geometry.sty \
tex-placeins.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
