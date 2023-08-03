SUMMARY = "Spanish translation of 'Obsolete packages and commands'"
DESCRIPTION = "A Spanish translation of the l2tabu practical guide to LaTeX2e \
by Mark Trettin. A list of obsolete packages, commands and \
usages."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-l2tabu-spanish-2023.209.1.1svn15878-56.1.noarch.rpm"
RPM_HASH = "bf1eecf45a309fbda5291ac6d502050758035d58974845368d0ee199d5e1f0c6099643c54a5f88e1aabe74ba8549f3a31c9766f79811f61bba677630b43162be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu-spanish"

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
